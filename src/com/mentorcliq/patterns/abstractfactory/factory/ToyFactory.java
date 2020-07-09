package com.mentorcliq.patterns.abstractfactory.factory;

import com.mentorcliq.patterns.abstractfactory.model.SurgeryItem;
import com.mentorcliq.patterns.abstractfactory.model.SurgeryItemType;
import com.mentorcliq.patterns.abstractfactory.model.toy.ToyRoom;
import com.mentorcliq.patterns.abstractfactory.model.toy.ToyTable;
import com.mentorcliq.patterns.abstractfactory.model.toy.ToyTools;
import com.mentorcliq.patterns.abstractfactory.model.toy.ToyWard;

public class ToyFactory extends SurgeryFactory {

    @Override
    public SurgeryItem getSurgeryItem(SurgeryItemType surgeryItemType) {
        switch (surgeryItemType) {
            case ROOM: {
                return new ToyRoom();
            }
            case WARD: {
                return new ToyWard();
            }
            case TABLE: {
                return new ToyTable();
            }
            case TOOLS: {
                return new ToyTools();
            }
            default: {
                throw new IllegalArgumentException("No such type");
            }
        }
    }
}
