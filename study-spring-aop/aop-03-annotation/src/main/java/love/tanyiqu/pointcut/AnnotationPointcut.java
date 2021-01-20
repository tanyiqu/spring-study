package love.tanyiqu.pointcut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {

    @Before("execution(* love.tanyiqu.service.*.*(..))")
    public void before() {
        System.out.println("===方法执行前===");
    }

    @After("execution(* love.tanyiqu.service.*.*(..))")
    public void after() {
        System.out.println("===方法执行后===");
    }

}
