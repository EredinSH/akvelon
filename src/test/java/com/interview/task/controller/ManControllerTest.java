package com.interview.task.controller;

import com.interview.task.domain.Bottle;
import com.interview.task.domain.Man;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ManControllerTest {

    @Autowired
    ManController controller;
    @Autowired
    Man man;
    @Autowired
    Bottle bottle;

    @Test
    public void lackOfWater() {

        //GIVEN
        Bottle bottle1 = new Bottle(0);
        Man man1 = new Man(5);

        //WHEN
        String result = controller.drinkADrink(man1,bottle1);

        //THEN
        assertEquals(result,"You didn't drink anything!");

    }

    @Test
    public void canStillDrink() {

        //GIVEN
        Bottle bottle1 = new Bottle(1.5);
        Man man1 = new Man(5);

        //WHEN
        String result = controller.drinkADrink(man1,bottle1);

        //THEN
        assertEquals(result,"You have a drunk, you can still drink 3.5l");

    }

    @Test
    public void tooMuchToDrink() {

        //GIVEN
        Bottle bottle1 = new Bottle(12.25);
        Man man1 = new Man(5);

        //WHEN
        String result = controller.drinkADrink(man1,bottle1);

        //THEN
        assertEquals(result,"You can't drink that much!");

    }

}
