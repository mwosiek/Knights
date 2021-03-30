package com.clockworkjava.Rycerze.Rycerze.domain.repository;

import com.clockworkjava.Rycerze.Rycerze.domain.Knight;
import jdk.jshell.spi.ExecutionControl;

import java.util.Collection;
import java.util.Optional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {

    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    void createKnight(Knight knight);

    Knight getKnightById(Integer id);

    default void updateKnight(int id, Knight knight) { throw new NotImplementedException(); }
}
