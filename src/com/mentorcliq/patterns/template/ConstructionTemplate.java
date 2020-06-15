package com.mentorcliq.patterns.template;

public abstract class ConstructionTemplate {

    public final void construct() {
        System.out.println("===== Construction Started =====");
        buildParking();
        buildBuilding();
        installSewageSystem();
        installHeatingSystem();
        installCoolingSystem();
        installWindows();
        buildGarden();
        System.out.println("===== Construction Finished =====");
    }

    public final void buildParking() {
        System.out.println("Build parking");
    }

    public final void buildBuilding() {
        System.out.println("Build building");
    }

    public final void installSewageSystem() {
        System.out.println("Install sewage system");
    }

    public abstract void installHeatingSystem();
    public abstract void installCoolingSystem();
    public abstract void installWindows();
    public abstract void buildGarden();
}
