package com.company;

import java.util.logging.Logger;

public class Kitchen implements ObserverInterface{
    private static final Logger LOGGER = Logger.getLogger(Kitchen.class.getName());

    @Override
    public void update(Order order) {
        LOGGER.info(order.toString());
    }
}
