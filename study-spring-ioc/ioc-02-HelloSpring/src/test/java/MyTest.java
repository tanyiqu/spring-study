import love.tanyiqu.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello);
    }
}
