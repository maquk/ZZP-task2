package com.company;

import java.util.logging.Logger;

public class HeaterControlImpl implements HeaterControlInterface {
    private static final Logger LOGGER = Logger.getLogger(HeaterControlImpl.class.getName());

    @Override
    public void turnOn() {
        LOGGER.info("Turned the heater on");
    }

    @Override
    public void turnOff() {
        LOGGER.info("Turned the heater off");
    }

    @Override
    public void setTemperature(int temperature) {
        LOGGER.info(String.format("Set the temperature to %d C", temperature));
    }
}
