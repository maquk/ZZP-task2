package com.company;

import java.util.logging.Logger;

public class OrderHandler implements CommandInterface{
    private Order order;
    private static final Logger LOGGER = Logger.getLogger(OrderHandler.class.getName());

    public OrderHandler(Order order) {
        super();
        this.order = order;
    }


    @Override
    public void execute() {
        LOGGER.info("Started a new order");
        order.orderItems();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
