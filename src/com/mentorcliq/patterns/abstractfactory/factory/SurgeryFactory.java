package com.mentorcliq.patterns.abstractfactory.factory;

import com.mentorcliq.patterns.abstractfactory.model.SurgeryItem;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryItemType;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryType;

public abstract class SurgeryFactory {

    public static SurgeryFactory getSurgeryFactory(SurgeryType surgeryType) {

        switch (surgeryType) {
            case TOY: {
                return new ToyFactory();
            }
            case HOSPITAL: {
                return new HospitalFactory();
            }
            case UNIVERSITY: {
                return new UniversityFactory();
            }
            default: {
                throw new IllegalArgumentException("No such type");
            }
        }
    }

    public abstract SurgeryItem getSurgeryItem(SurgeryItemType surgeryItemType);
}
