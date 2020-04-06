package com.company;

import java.util.LinkedList;
import java.util.List;

public class OrderBooth implements SubjectInterface {
    private List<ObserverInterface> observerList = new LinkedList<>();
    private SaleStrategyInterface saleStrategy;

    public OrderBooth() {
        this.saleStrategy = new NoDiscountSaleStrategy();
    }

    public void setSaleStrategy(SaleStrategyInterface saleStrategy) {
        this.saleStrategy = saleStrategy;
    }

    public void informAboutOrder(OrderHandler orderHandler) {
        saleStrategy.sell(orderHandler.getOrder());
        orderHandler.execute();
        notifyObservers(orderHandler.getOrder());
    }

    @Override
    public void register(ObserverInterface observerInterface) {
        observerList.add(observerInterface);
    }

    @Override
    public void notifyObservers(Order order) {
        for (ObserverInterface observerInterface : observerList) {
            observerInterface.update(order);
        }
    }
}
