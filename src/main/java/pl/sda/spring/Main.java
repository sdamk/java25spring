package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.spring.sample.Knight;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        Knight knight1 = context.getBean("knight1", Knight.class);
        Knight knight2 = context.getBean("knight2", Knight.class);
        knight1.doQuest();
        knight2.doQuest();
    }
}
