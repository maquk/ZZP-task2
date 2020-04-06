package com.company;

import java.util.logging.Logger;

public class DoorControlImpl implements DoorControlInterface {
    private static final Logger LOGGER = Logger.getLogger(DoorControlImpl.class.getName());

    @Override
    public void close() {
        LOGGER.info("Closed the doors");
    }

    @Override
    public void open() {
        LOGGER.info("Opened the doors");
    }

    @Override
    public void lock() {
        LOGGER.info("Locked the doors");
    }

    @Override
    public void unlock() {
        LOGGER.info("Unlocked the doors");
    }
}
