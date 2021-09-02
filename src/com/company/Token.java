package com.company;

import java.util.Date;

public class Token {
    private String tokenNumber;
    private Slot slotInformation;
    private Car carInformation;
    private Date tokenDate;
    private long checkInTime;
    private long checkOutTime;

    public Token(String tokenNumber, Slot slotInformation, Car carInformation){
        this.tokenNumber = tokenNumber;
        this.slotInformation = slotInformation;
        this.carInformation = carInformation;
        this.tokenDate = new Date();
        this.checkInTime = System.currentTimeMillis();
    }

    public String getTokenNumber(){
        return tokenNumber;
    }

    public Slot getSlotInformation(){
        return slotInformation;
    }

    public Car getCarInformation(){
        return carInformation;
    }

    public long getCheckInTime() {
        return checkInTime;
    }

    public long updateCheckoutTime(){
        return checkOutTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Token{" +
                "tokenNumber='" + tokenNumber + '\'' +
                ", slotInformation=" + slotInformation +
                ", carInformation=" + carInformation +
                ", tokenDate=" + tokenDate +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                '}';
    }
}


