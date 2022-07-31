package demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //set up configuration file to use
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Coach myCoach = context.getBean(FootballCoach.class);
        System.out.println(myCoach.workOut());
    }
}
