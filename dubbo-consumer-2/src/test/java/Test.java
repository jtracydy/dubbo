import com.dubbo.api.test.CheckService;
import com.dubbo.api.test.Demo2Service;
import com.dubbo.api.test.LoginService;
import com.dubbo.common.test.api.req.UserAPIRequest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:springmvc-2.xml" });
        context.start();
        Demo2Service demoService = (Demo2Service)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果


        LoginService loginService = (LoginService)context.getBean("loginService");
        UserAPIRequest user = new UserAPIRequest();
        user.setUserName("lucas");
        user.setPassword("123");
        System.out.println(loginService.login(user));

        /**
         * 在dubbo-consumer-2中配置 启动时检查标签，可以再启动时忽略检查没有provider的服务
         */
        CheckService checkService = (CheckService)context.getBean("checkService");

    }
}