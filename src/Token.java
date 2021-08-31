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

    public long updateCheckoutTime(){
        return checkOutTime = System.currentTimeMillis();
    }
}
