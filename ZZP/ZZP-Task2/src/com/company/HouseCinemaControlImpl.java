package com.company;

import java.util.logging.Logger;

public class HouseCinemaControlImpl implements LightControlInterface{
    private static final Logger LOGGER = Logger.getLogger(HouseCinemaControlImpl.class.getName());
    LightControlInterface decorated;

    public HouseCinemaControlImpl(LightControlInterface decorated) {
        this.decorated = decorated;
    }


    @Override
    public void turnOn() {
        LOGGER.info("Turned on the house cinema");
        decorated.turnOn();
    }

    @Override
    public void turnOff() {
        LOGGER.info("Turned off the house cinema");
        decorated.turnOff();
    }

    public void setColor(String color) {
        LOGGER.info(String.format("Color set to %s", color));
    }

    public void turnOnDynamicLighting() {
        LOGGER.info("Turned on dynamic lighting");
    }

    public void turnOffDynamicLighting() {
        LOGGER.info("Turned off dynamic lighting");
    }
}
