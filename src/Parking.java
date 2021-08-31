import java.util.ArrayList;
import java.util.List;

public class Parking {
    private int totalNumberOfSlots;
    private Slot[] slotsInLot;
    private List<Token> tokens;

    public Parking(int totalNumberOfSlots){
        this.totalNumberOfSlots = totalNumberOfSlots;
        slotsInLot = new Slot[totalNumberOfSlots];
        tokens = new ArrayList<>();
    }

    public Token parkACar(Car car){
        if(isThereAFreeSlot()){
            Slot availableSlot = getTheNextFreeSlot();
            Token newToken = new Token(String.valueOf(System.currentTimeMillis()), availableSlot, car);
            this.tokens.add(newToken);
        }
        return null;
    }

    private Slot getTheNextFreeSlot() {
        for(Slot slot:slotsInLot){
            if(slot.isItFree()){
                return slot;
            }
        }
        return null;
    }

    private boolean isThereAFreeSlot() {
        boolean isThereAFreeSlot = false;
        for(Slot slot:slotsInLot){
            if(slot.isItFree()){
                isThereAFreeSlot = true;
                break;
            }
        }
        return isThereAFreeSlot;
    }

    public void unParkCar(Token token){
        for(Token tokenInLot: tokens){
            if(tokenInLot.getTokenNumber()==token.getTokenNumber()){
                token.updateCheckoutTime();
            }
        }
    }
}
