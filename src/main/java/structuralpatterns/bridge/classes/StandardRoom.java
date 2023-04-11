package structuralpatterns.bridge.classes;

public class StandardRoom extends Room{
    public StandardRoom( int numberRoom, float dailyPrice){
        super(numberRoom, dailyPrice);
    }

    public float calculateDailyPrice(){
        return this.dailyPrice;
    }
}
