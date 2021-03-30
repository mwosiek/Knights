package com.clockworkjava.Rycerze.Rycerze.domain;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PlayerInformation {

    private int gold = 0;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
