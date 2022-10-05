package mvc.letstry.config;

import mvc.letstry.service.TeastBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfir {

    @Bean
    public TeastBean getTestBean(){
        return new TeastBean("Hello ");
    }
}
