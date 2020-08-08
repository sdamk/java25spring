package pl.sda.spring.sample;

import lombok.ToString;

@ToString
public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void doQuest() {
        quest.embarkQuest();
    }
}
