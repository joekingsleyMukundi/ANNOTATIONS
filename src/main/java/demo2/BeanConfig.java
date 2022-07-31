package demo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//using configuration file sto do depedancy injections and inversion of controll
@Configuration
@ComponentScan(basePackages = "demo2")
public class BeanConfig {
    /**
     * creating beans in the config without component scan
     * //@Bean
     * public SwimmingCoach swimcoach(){
     *     return new SwimmingCoach
     * }
     */
}
