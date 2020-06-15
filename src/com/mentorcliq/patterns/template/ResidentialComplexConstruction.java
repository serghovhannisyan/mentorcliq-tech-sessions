package com.mentorcliq.patterns.template;

import com.mentorcliq.patterns.decorator.WindowsStoreCompany;
import com.mentorcliq.patterns.decorator.model.Window;

public class ResidentialComplexConstruction extends ConstructionTemplate {

    @Override
    public void installHeatingSystem() {
        System.out.println("Install individual heating system");
    }

    @Override
    public void installCoolingSystem() {
        System.out.println("Install mid quality air condition designed for small rooms");
    }

    @Override
    public void installWindows() {
        Window window = WindowsStoreCompany.orderBasicWindow().build();
        System.out.println("Install " + window.getDescription());
    }

    @Override
    public void buildGarden() {
        System.out.println("Build garden with fruit trees");
    }
}
