package com.company;

import java.util.logging.Logger;

public class GardenLightControlImpl implements LightControlInterface{
    private static final Logger LOGGER = Logger.getLogger(GardenLightControlImpl.class.getName());
    LightControlInterface decorated;

    public GardenLightControlImpl(LightControlInterface decorated) {
        this.decorated = decorated;
    }


    @Override
    public void turnOn() {
        LOGGER.info("Turned on the garden light");
        decorated.turnOn();
    }

    @Override
    public void turnOff() {
        LOGGER.info("Turned off the garden light");
        decorated.turnOff();
    }

    public void turnOn(int percentage) {
        decorated.turnOn();
        LOGGER.info(String.format("Set the lights usage - %d %%", percentage));
    }
}
