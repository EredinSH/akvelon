package com.interview.task.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

public class Bottle {

    private Long id;
    private int volume;

    public Bottle() {
    }

    public Bottle(Long id, int volume) {
        this.id = id;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
