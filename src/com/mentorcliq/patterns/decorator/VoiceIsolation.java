package com.mentorcliq.patterns.decorator;

import com.mentorcliq.patterns.decorator.model.Window;

public class VoiceIsolation extends WindowDecorator {

    public VoiceIsolation(Window window) {
        super(window);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addVoiceIsolation();
    }

    @Override
    public float getPrice() {
        return super.getPrice() + addPrice();
    }

    private float addPrice() {
        return 5;
    }

    private String addVoiceIsolation() {
        return " + voice isolation";
    }
}
