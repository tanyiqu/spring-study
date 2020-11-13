import com.tanyiqu.dao.UserDaoImplMySQL;
import com.tanyiqu.dao.UserDaoImplOracle;
import com.tanyiqu.service.UserService;
import com.tanyiqu.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void getUser(){
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoImplMySQL());

        userService.getUser();
    }

}
