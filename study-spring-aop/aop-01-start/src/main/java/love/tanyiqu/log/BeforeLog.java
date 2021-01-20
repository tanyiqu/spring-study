package love.tanyiqu.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[" + method.getName() + "] 开始执行");
        System.out.println("参数为：" + Arrays.toString(args));

    }
}
