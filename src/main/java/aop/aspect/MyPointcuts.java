package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;


public class MyPointcuts {
    @Pointcut("execution(* aasdqw*(..))")
    public void allAddMethods() {}
}
