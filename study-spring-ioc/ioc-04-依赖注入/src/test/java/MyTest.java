import love.tanyiqu.pojo.Student;
import love.tanyiqu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);

    }

    @Test
    public void testP_C(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User userP = context.getBean("userP", User.class);
        User userC = context.getBean("userC", User.class);
        System.out.println(userP);
        System.out.println(userC);
    }



}
