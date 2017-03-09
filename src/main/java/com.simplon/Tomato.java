package com.simplon;


public class Tomato extends Plant {


    public Tomato() {
        this.name = "Tomato";
    }

    @Override
    void putWater() {
        this.water = 5;
    }

    @Override
    void putFertilizer() {
        this.fertilizer = 2;
    }
}
