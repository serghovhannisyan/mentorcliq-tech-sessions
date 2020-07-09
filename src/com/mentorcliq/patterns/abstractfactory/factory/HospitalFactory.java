package com.mentorcliq.patterns.abstractfactory.factory;

import com.mentorcliq.patterns.abstractfactory.model.SurgeryItem;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryItemType;
import com.mentorcliq.patterns.abstractfactory.model.medical.MedicalRoom;
import com.mentorcliq.patterns.abstractfactory.model.medical.MedicalTable;
import com.mentorcliq.patterns.abstractfactory.model.medical.MedicalTools;
import com.mentorcliq.patterns.abstractfactory.model.medical.MedicalWard;

public class HospitalFactory extends SurgeryFactory {

    @Override
    public SurgeryItem getSurgeryItem(SurgeryItemType surgeryItemType) {
        switch (surgeryItemType) {
            case ROOM: {
                return new MedicalRoom();
            }
            case WARD: {
                return new MedicalWard();
            }
            case TABLE: {
                return new MedicalTable();
            }
            case TOOLS: {
                return new MedicalTools();
            }
            default: {
                throw new IllegalArgumentException("No such type");
            }
        }
    }
}
