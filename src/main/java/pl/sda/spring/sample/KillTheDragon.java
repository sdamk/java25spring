package pl.sda.spring.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
public class KillTheDragon implements Quest {
    @Override
    public void embarkQuest() {
        System.out.println("Kill The Dragon !!!");
    }
}
