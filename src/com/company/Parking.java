package com.company;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    private int totalNumberOfSlots;
    private Slot[] availableSlots;
    //private Slot[] slotsInLot;
    private List<Token> tokens;
    List<Token> myList = new ArrayList<Token>();

    public Parking(int totalNumberOfSlots){
        System.out.println(totalNumberOfSlots);
        this.totalNumberOfSlots = totalNumberOfSlots;
        availableSlots = new Slot[totalNumberOfSlots];
        tokens = new ArrayList<>();
        populateSlots(totalNumberOfSlots);
    }

    private void populateSlots(int totalNumberOfSlots) {
        for(int slotNumber=0;slotNumber<totalNumberOfSlots;slotNumber++){
            availableSlots[slotNumber] = new Slot(String.valueOf(slotNumber+1000));
        }
    }

    public Token parkACar(Car car){
        if(isThereAFreeSlot()){
            System.out.println("Free slot available");
            Slot availableSlot = getSlot();
            Token newToken = new Token(String.valueOf(System.currentTimeMillis()), availableSlot, car);
            System.out.println(newToken.toString());
            //this.tokens.add(newToken);
            myList.add(newToken);
            System.out.println("New Token:" + newToken);
            return newToken;
        }
        return null;
    }

    public Token tokenInfo(){
        System.out.println("Token Info");
        System.out.println(myList);
        return null;
    }

    private boolean isThereAFreeSlot() {
        boolean isThereAFreeSlot = false;
        for(Slot slot:availableSlots){
            System.out.println(slot.toString());
            if(slot.isItFree()){
                isThereAFreeSlot = true;
                break;
            }
        }
        System.out.println(isThereAFreeSlot);
        return isThereAFreeSlot;
    }

    private Slot getSlot() {
        for(Slot slot:availableSlots){
            if(slot.isItFree()){
                return slot;
            }
        }
        return null;
    }

    public void unParkCar(Token token){
        for(Token tokenInLot: tokens){
            if(tokenInLot.getTokenNumber()==token.getTokenNumber()){
                token.updateCheckoutTime();
            }
        }
    }
}
