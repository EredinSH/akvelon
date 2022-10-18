package com.interview.task.controller;

import com.interview.task.domain.Bottle;
import com.interview.task.domain.Man;
import org.springframework.stereotype.Controller;

@Controller
public class ManController {

    private Man man;

    public ManController(Man man) {
        this.man = man;
    }

    public double getStomachVolume() {
        return man.getStomachVolume();
    }

    public void setStomachVolume(double stomachVolume) {
        man.setStomachVolume(stomachVolume);
    }

    public String drinkADrink(Man man, Bottle bottle) {
        return man.haveDrink(man, bottle);
    }
}
