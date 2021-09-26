import com.ldy.ldyConfig.ldyConfig;
import com.ldy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new AnnotationConfigApplicationContext(ldyConfig.class);
        //getBean : 参数即为spring配置文件中bean的id
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
