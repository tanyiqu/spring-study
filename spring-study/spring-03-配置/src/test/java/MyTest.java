import com.tanyiqu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user1 = (User) context.getBean("user1");
        User u1 = (User) context.getBean("u1");
        User u2 = (User) context.getBean("user2");

        System.out.println(user1);
        System.out.println(u1);
        System.out.println(u2);

    }
}
