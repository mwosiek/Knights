package com.clockworkjava.Rycerze.Rycerze;

import com.clockworkjava.Rycerze.Rycerze.domain.repository.KnightRepository;
import com.clockworkjava.Rycerze.Rycerze.domain.repository.QuestRepository;
import com.clockworkjava.Rycerze.Rycerze.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... strings) throws Exception {

        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        questService.assignRandomQuest("Percival");

    }

}

