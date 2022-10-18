package com.interview.task.controller;

import com.interview.task.domain.Bottle;

import org.springframework.stereotype.Controller;

@Controller
public class BottleController {

    private Bottle bottle;

    public BottleController(Bottle bottle) {
        this.bottle = bottle;
    }

    public double getBottleVolume() {
        return bottle.getVolume();
    }

    public void setBottleVolume(double volume) {
        bottle.setVolume(volume);
    }

    public String pourADrink(Bottle bottle, double quantity) {
        return bottle.pour(bottle, quantity);
    }

}
