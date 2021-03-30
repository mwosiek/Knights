package com.clockworkjava.Rycerze.Rycerze.config;

import com.clockworkjava.Rycerze.Rycerze.domain.repository.DBKnightRepository;
import com.clockworkjava.Rycerze.Rycerze.domain.repository.InMemoryRepository;
import com.clockworkjava.Rycerze.Rycerze.domain.repository.KnightRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MainConfig {


    @Bean(name="inMemoryKnighRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo() {
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo() {
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}
