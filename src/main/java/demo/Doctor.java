package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// to define a bean id   using components:@Component("beanid")
//but spring generates a default bean id which is the class name but in small leters
public class Doctor implements Staff{
    private FortuneService fortuneService;
    //dependancy injection using  constructor injection
   /** //@Autowired
    public Doctor(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
 */

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    //dependancy injection using setter method
    //@Autowired
    /**
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */
    //use dependany injection using just any method noot just setters
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String assist(){
        return "hello world";
    }

    @Override
    public String workType() {
        return "treat patients";
    }
}
