package com.interview.task.domain;

import com.interview.task.repository.Container;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Bottle implements Container  {

    private double volume;

    public Bottle(double volume) {
        this.volume = volume;
    }

    @Override
    public String pour(Bottle bottle, double quantity) {
        String result;
        if(quantity == 0) {
            result = "Lack od water!";
        } else if (quantity <= bottle.getVolume()) {
            double howManyPour = bottle.getVolume() - quantity;
            String s = Double.toString(howManyPour);
            result = "You can still pour " + s + "l";
        } else if (quantity > bottle.getVolume()) {
            String s = Double.toString(bottle.getVolume());
            result = "You can't pour that much water! Bottle has only " + s + "l";
        } else {
            result = "You entered incorrect data";
        }

        return result;
    }

}
