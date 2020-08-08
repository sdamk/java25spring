package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.spring.sample.Knight;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        Knight bean = context.getBean(Knight.class);
        System.out.println(bean);
    }
}
