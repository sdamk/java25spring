package pl.sda.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.spring.sample.KillTheDragon;
import pl.sda.spring.sample.Knight;
import pl.sda.spring.sample.Quest;
import pl.sda.spring.sample.SaveTheQueen;

@Configuration
class JavaConfig {

    @Bean(name = "save")
    Quest saveTheQueen() {
        return new SaveTheQueen();
    }

    @Bean
    Quest killTheDragon() {
        return new KillTheDragon();
    }

    @Bean
    Knight knight1(@Qualifier("save") Quest quest) {
        return new Knight(quest);
    }

    @Bean
    Knight knight2(Quest killTheDragon) {
        return new Knight(killTheDragon);
    }
}
