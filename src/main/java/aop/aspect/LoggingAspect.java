package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//
//    }
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void ReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !ReturnMagazineFromUniLibrary()")
//    private void AllMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("AllMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice Log #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethotFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethotFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethotFromUniLibrary() || allReturnMethotFromUniLibrary() ")
//    private void allGetAndReturnMethotFromUniLibrary() {
//    }
//
//    @Before("allGetMethotFromUniLibrary()")
//    public void beforGetLoggingAdvice() {
//        System.out.println("beforGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethotFromUniLibrary()")
//    public void beforRetornLoggingAdvice() {
//        System.out.println("beforRetornLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethotFromUniLibrary()")
//    public void beforGetAndReturnLoggingAdvice() {
//        System.out.printf("beforGetAndReturnLoggingAdvice: writing Log #3");
//    }
//


    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
       MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnTupe() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for( Object obj: arguments ) {
                if(obj instanceof Book) {
                    Book mybook = (Book)obj;
                    System.out.println("Информация о книге: название -  " + mybook.getName() + "Автор - " + mybook.getAuthor()
                            + "год издания - " + mybook.getYearOfPublication()) ;
                }
                else if(obj instanceof String) {
                    System.out.println(" Книгу в библиотеку добавляет " +obj );
                }
            }
        }

        System.out.println("логирование " + "Попытки получить книгу/журнал");
        System.out.println("----------------------------");
    }


}