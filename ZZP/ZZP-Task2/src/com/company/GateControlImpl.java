package com.company;

import java.util.logging.Logger;

public class GateControlImpl implements LightControlInterface {
    private static final Logger LOGGER = Logger.getLogger(GateControlImpl.class.getName());
    LightControlInterface decorated;

    public GateControlImpl(LightControlInterface decorated) {
        this.decorated = decorated;
    }

    @Override
    public void turnOn() {
        LOGGER.info("Turned on the gate light");
        decorated.turnOn();
    }

    @Override
    public void turnOff() {
        LOGGER.info("Turned off the gate light");
        decorated.turnOff();
    }
}
