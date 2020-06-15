package com.mentorcliq.patterns.decorator;

import com.mentorcliq.patterns.decorator.model.Window;

public class UltraVioletRaysProtection extends WindowDecorator {

    public UltraVioletRaysProtection(Window window) {
        super(window);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addUltraVioletRaysProtection();
    }

    @Override
    public float getPrice() {
        return super.getPrice() + addPrice();
    }

    private float addPrice() {
        return 10;
    }

    private String addUltraVioletRaysProtection() {
        return " + ultra-violet rays protection";
    }
}
