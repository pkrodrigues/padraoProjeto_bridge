package structuralpatterns.bridge.classes;

public abstract class Room {
    protected Customer customer;
    protected int roomNumber;

    protected float dailyPrice;

    public Room(int roomNumber, float dailyPrice){this.roomNumber = roomNumber; this.dailyPrice = dailyPrice;}

    public void setCustomertype(Customer customer) {
        this.customer = customer;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setDailyPrice( float dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public abstract float calculateDailyPrice();
}
