package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.spring.sample.SomeBean;
import pl.sda.spring.sample.SomeBeanTwo;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        SomeBeanTwo someBeanTwo = context.getBean("someBeanTwo", SomeBeanTwo.class);
        SomeBeanTwo someBeanTwo_2 = context.getBean("someBeanTwo_2", SomeBeanTwo.class);

        System.out.println(someBeanTwo);
        System.out.println(someBeanTwo);
    }
}
