package com.mentorcliq.patterns.template.construction;

import com.mentorcliq.patterns.decorator.WindowsStoreCompany;
import com.mentorcliq.patterns.decorator.model.Window;

public class BusinessCenterConstruction extends ConstructionTemplate {

    @Override
    public void installHeatingSystem() {
        System.out.println("Install centralized heating system");
    }

    @Override
    public void installCoolingSystem() {
        System.out.println("Install premium air conditioner designed for large offices");
    }

    @Override
    public void installWindows() {
        // just combined with decorator as I missed that one
        Window window = WindowsStoreCompany.orderPremiumWindow()
                .withVoiceIsolation()
                .withUltraVioletRaysProtection()
                .build();

        System.out.println("Install " + window.getDescription());
    }

    @Override
    public void buildGarden() {
        System.out.println("Build garden with fountain and palms");
    }
}
