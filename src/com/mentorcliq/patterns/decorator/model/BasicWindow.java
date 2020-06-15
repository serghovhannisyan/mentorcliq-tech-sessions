package com.mentorcliq.patterns.decorator.model;

public class BasicWindow implements Window {

    @Override
    public String getDescription() {
        return "Half-height usual window";
    }

    @Override
    public float getPrice() {
        return 15f;
    }
}
