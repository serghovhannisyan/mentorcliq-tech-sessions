package com.mentorcliq.patterns.abstractfactory;

import com.mentorcliq.patterns.abstractfactory.factory.SurgeryFactory;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryItem;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryItemType;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryType;
import com.mentorcliq.run.PatternRunner;

public class AbstractFactoryRunner implements PatternRunner {

    @Override
    public void run() {
        SurgeryFactory toyFactory = SurgeryFactory.getSurgeryFactory(SurgeryType.TOY);
        SurgeryItem toyTools = toyFactory.getSurgeryItem(SurgeryItemType.TOOLS);

        SurgeryFactory universityFactory = SurgeryFactory.getSurgeryFactory(SurgeryType.UNIVERSITY);
        SurgeryItem maquetteTools = universityFactory.getSurgeryItem(SurgeryItemType.TOOLS);

        washAndPrepareSurgeryTools(toyTools);
        washAndPrepareSurgeryTools(maquetteTools);
    }

    private void washAndPrepareSurgeryTools(SurgeryItem item) {
        System.out.println("Do some staff: " + item.getName());
    }
}
