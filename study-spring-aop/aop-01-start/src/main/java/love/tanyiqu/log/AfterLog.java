package love.tanyiqu.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[" + method.getName() + "] 执行结束");
        System.out.println("返回值为：[" + returnValue + "]");
    }
}
