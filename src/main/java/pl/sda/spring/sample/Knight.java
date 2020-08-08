package pl.sda.spring.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Knight {
    private Quest quest;

    //@Autowired
    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void doQuest() {
        quest.embarkQuest();
    }
}
