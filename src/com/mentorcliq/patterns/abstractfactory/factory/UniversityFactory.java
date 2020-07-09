package com.mentorcliq.patterns.abstractfactory.factory;

import com.mentorcliq.patterns.abstractfactory.model.SurgeryItem;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryItemType;
import com.mentorcliq.patterns.abstractfactory.model.maquette.MaquetteRoom;
import com.mentorcliq.patterns.abstractfactory.model.maquette.MaquetteTable;
import com.mentorcliq.patterns.abstractfactory.model.maquette.MaquetteTools;
import com.mentorcliq.patterns.abstractfactory.model.maquette.MaquetteWard;

public class UniversityFactory extends SurgeryFactory {

    @Override
    public SurgeryItem getSurgeryItem(SurgeryItemType surgeryItemType) {
        switch (surgeryItemType) {
            case ROOM: {
                return new MaquetteRoom();
            }
            case WARD: {
                return new MaquetteWard();
            }
            case TABLE: {
                return new MaquetteTable();
            }
            case TOOLS: {
                return new MaquetteTools();
            }
            default: {
                throw new IllegalArgumentException("No such type");
            }
        }
    }
}
