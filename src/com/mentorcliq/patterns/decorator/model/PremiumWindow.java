package com.mentorcliq.patterns.decorator.model;

public class PremiumWindow implements Window {

    @Override
    public String getDescription() {
        return "Stained high-quality window";
    }

    @Override
    public float getPrice() {
        return 25f;
    }
}
