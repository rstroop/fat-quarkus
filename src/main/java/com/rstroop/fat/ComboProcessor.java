package com.rstroop.fat;

import java.util.Random;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * ComboProcessor
 */
public class ComboProcessor implements Processor {

    Random random = new Random();

    public void process(Exchange e){
        Combo combo = new Combo();
        combo.setId(random.nextLong());
        combo.setCombo1(random.nextInt(100));
        combo.setCombo2(random.nextInt(100));
        combo.setCombo3(random.nextInt(100));
        combo.setSecret("Camels Secret");

        e.getIn().setBody(combo);
    }
}