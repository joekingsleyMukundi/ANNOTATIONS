package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //but spring generates a default bean id which is the class name but in small letersat the fistname(when using components)
        Doctor doc = context.getBean(Doctor.class);
        Staff nurse = context.getBean(Nurse.class);
        System.out.println(doc.workType() + doc.getFortuneService().getFortune());
        System.out.println(nurse.workType());
    }
}
