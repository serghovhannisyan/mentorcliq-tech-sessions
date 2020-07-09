package com.mentorcliq.patterns.abstractfactory.model;

public abstract class SurgeryItem {

    private String name;

    public String getName() {
        return getClass().getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}
