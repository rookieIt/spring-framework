import cn.spring.will.demo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

/**
 * 基于Java的配置类加载Spring的应用上下文
 * @date 2021/2/9
 */
public class App {

	private static final Logger logger = Logger.getLogger("logger:");

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		User bean = (User) context.getBean("asheUser");
		logger.info(bean.toString());
	}
}
