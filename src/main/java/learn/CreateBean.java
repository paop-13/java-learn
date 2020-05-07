package learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBean {

    @Bean
    public Count getCount(){
        return new Count();
    }
}