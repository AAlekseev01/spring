package aop.aspect;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("логируем получение списка студентов перед методом getStudents");
//    }

    //    @AfterReturning(pointcut = "execution(* getStudents())"
//            ,returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("логируем получение списка студентов после работы метода getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())"
//            ,throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("Логируем выброс исключения" + exception);
//    }
    @After("execution(* getStudents()) ")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("Логируем нормальное окончание работы метода или выброс исключения");
    }

}
