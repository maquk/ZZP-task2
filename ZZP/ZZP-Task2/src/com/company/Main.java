package com.company;

public class Main {

    public static void main(String[] args) {
        HouseControlFacade houseControlFacade = new HouseControlFacade();
        GardenLightControlImpl gardenLightControl = new GardenLightControlImpl(new LightControlImpl());

        houseControlFacade.setEnterHouseProfile();
        houseControlFacade.setSleepProfile();

        gardenLightControl.turnOn(50);
    }
}
