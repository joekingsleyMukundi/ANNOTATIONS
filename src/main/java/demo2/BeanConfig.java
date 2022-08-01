package demo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//using configuration file sto do depedancy injections and inversion of controll
@Configuration
@ComponentScan(basePackages = "demo2")
//when geting values from propertiesfile
//@PropertySource("classpath:sport.properties
//now where you want tp pass thisvalies
//@Value("${foo.team}")
//private String team
// note the last two lines are supposed to be in the class youdefined them
public class BeanConfig {
    /**
     * creating beans in the config without component scan
     * //@Bean
     * public SwimmingCoach swimcoach(){
     *     return new SwimmingCoach
     * }
     */
}
