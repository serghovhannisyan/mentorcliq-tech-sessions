package com.mentorcliq.patterns.template;

public class ConstructionCompany {

    public void createResidentialComplex() {
        create(new ResidentialComplexConstruction());
    }

    public void createBusinessCenter() {
        create(new BusinessCenterConstruction());
    }

    private void create(ConstructionTemplate template) {
        template.construct();
    }

}
