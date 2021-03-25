import com.tyfann.config.TyfannConfig;
import com.tyfann.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tyfann
 * @date 2021/3/25 4:56 下午
 */
public class MyTest {
    @Test
    public void test7(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TyfannConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
