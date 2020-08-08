package pl.sda.spring.sample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class SaveTheQueen implements Quest {
    @Override
    public void embarkQuest() {
        System.out.println("Save the Queen!!!");
    }
}
