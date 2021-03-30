import com.tyfann.mapper.UserMapper1;
import com.tyfann.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author tyfann
 * @date 2021/3/30 9:37 上午
 */
public class MyTest {
    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper1 userMapper1 = context.getBean("userMapper2", UserMapper1.class);
        for (User user : userMapper1.selectUser()){
            System.out.println(user);
        }
    }
}
