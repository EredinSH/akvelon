package com.interview.task.domain;

public class Man {

    private Long id;
    private int stomachVolume;

    public Man() {
    }

    public Man(Long id, int stomachVolume) {
        this.id = id;
        this.stomachVolume = stomachVolume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStomachVolume() {
        return stomachVolume;
    }

    public void setStomachVolume(int stomachVolume) {
        this.stomachVolume = stomachVolume;
    }
}
