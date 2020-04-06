package com.company;

import java.util.logging.Logger;

public class HouseControlFacade {
    private static Logger LOGGER = Logger.getLogger(HouseControlFacade.class.getName());
    private final DoorControlInterface doorControl = new DoorControlImpl();
    private final HeaterControlInterface heaterControl = new HeaterControlImpl();
    private final LightControlInterface lightControl = new LightControlImpl();
    public void setSleepProfile() {
        LOGGER.info("Sleep profile was set");
        doorControl.close();
        doorControl.lock();
        heaterControl.turnOn();
        heaterControl.setTemperature(22);
        lightControl.turnOff();
    }

    public void setEnterHouseProfile() {
        LOGGER.info("Enter the house profile was set");
        doorControl.unlock();
        doorControl.open();
        lightControl.turnOn();
        heaterControl.turnOn();
        heaterControl.setTemperature(25);
        doorControl.close();
    }
}
