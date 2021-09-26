import com.ldy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Copyright(c)2019-2021,Smart3dMap.Co.ltd
 * @Author TianSu (1201920637@cug.edu.cn)
 * @Classname MyTest
 * @Description
 * @DateTime 2021/9/26 21:08
 */
public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //动态代理代理的是接口
    UserService userService = (UserService) context.getBean("userService");

    userService.add();
  }
}
