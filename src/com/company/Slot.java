package com.company;

public class Slot {
    private String slotNumber;
    private boolean isParked;

    public boolean isItFree(){
        return !isParked;
    }

    public Slot(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Slot occupyTheSlot(){
        this.isParked=true;
        return this;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "slotNumber='" + slotNumber + '\'' +
                ", isParked=" + isParked +
                '}';
    }
}
