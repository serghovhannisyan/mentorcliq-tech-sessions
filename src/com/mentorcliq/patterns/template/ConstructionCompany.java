package com.mentorcliq.patterns.template;

import com.mentorcliq.patterns.template.construction.BusinessCenterConstruction;
import com.mentorcliq.patterns.template.construction.ConstructionTemplate;
import com.mentorcliq.patterns.template.construction.ResidentialComplexConstruction;

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
