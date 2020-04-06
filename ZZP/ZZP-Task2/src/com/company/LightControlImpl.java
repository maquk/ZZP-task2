package com.company;

import java.util.logging.Logger;

public class LightControlImpl implements LightControlInterface {
    private static final Logger LOGGER = Logger.getLogger(LightControlImpl.class.getName());

    @Override
    public void turnOn() {
        LOGGER.info("Turned the lights on");
    }

    @Override
    public void turnOff() {
        LOGGER.info("Turned the lights off");
    }
}
