package com.interview.task.domain;

import com.interview.task.interfaces.Drink;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Man implements Drink {

    private double stomachVolume;

    public Man(double stomachVolume) {
        this.stomachVolume = stomachVolume;
    }

    public String haveDrink(Man man, Bottle bottle) {
        String result;
        if(bottle.getVolume() == 0) {
            result = "You didn't drink anything!";
        } else if (bottle.getVolume() <=  man.getStomachVolume()) {
            double howManyDrink = man.getStomachVolume() - bottle.getVolume();
            String s = Double.toString(howManyDrink);
            result = "You have a drunk, you can still drink " + s + "l";
        } else if (bottle.getVolume() > man.getStomachVolume()) {
            result = "You can't drink that much!";
        } else {
            result = "You entered incorrect data";
        }

        return result;
    }


}
