import com.tanyiqu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void getUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService service = (UserService) context.getBean("userService");

        service.getUser();


    }

}
