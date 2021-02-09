import cn.spring.will.demo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2021/2/9
 */
@Configuration
public class AppConfig {

	@Bean(name="asheUser")
	public User entitlement() {
		User ent= new User();
		ent.setId(1000);
		ent.setName("ashe");
		ent.setSex("female");
		return ent;
	}

}
