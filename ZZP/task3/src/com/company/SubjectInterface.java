package com.company;

public interface SubjectInterface {
    void register (ObserverInterface observerInterface);
    void notifyObservers(Order order);
}
