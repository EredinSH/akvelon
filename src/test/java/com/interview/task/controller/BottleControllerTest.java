package com.interview.task.controller;

import com.interview.task.domain.Bottle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BottleControllerTest {

    @Autowired
    BottleController controller;
    @Autowired
    Bottle bottle;

    @Test
    public void lackOfWater() {

        //GIVEN
        Bottle bottle1 = new Bottle(0.25);

        //WHEN
        String result = controller.pourADrink(bottle1, 0);

        //THEN
        assertEquals(result,"Lack od water!");

    }

    @Test
    public void notEnoughWater() {

        //GIVEN
        Bottle bottle1 = new Bottle(0.5);

        //WHEN
        String result = controller.pourADrink(bottle1, 0.25);

        //THEN
        assertEquals(result,"You can still pour 0.25l");

    }

    @Test
    public void tooMuchWater() {

        //GIVEN
        Bottle bottle1 = new Bottle(0.25);

        //WHEN
        String result = controller.pourADrink(bottle1, 0.5);

        //THEN
        assertEquals(result,"You can't pour that much water! Bottle has only 0.25l");

    }


}
