import com.tyfann.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tyfann
 * @date 2021/3/24 9:03 下午
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
