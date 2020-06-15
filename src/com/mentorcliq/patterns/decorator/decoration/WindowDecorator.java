package com.mentorcliq.patterns.decorator.decoration;

import com.mentorcliq.patterns.decorator.model.Window;

public abstract class WindowDecorator implements Window {

    private final Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public String getDescription() {
        return window.getDescription();
    }

    @Override
    public float getPrice() {
        return window.getPrice();
    }
}
