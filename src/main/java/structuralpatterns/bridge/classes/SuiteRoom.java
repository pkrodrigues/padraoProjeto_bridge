package structuralpatterns.bridge.classes;

public class SuiteRoom extends Room{

    public SuiteRoom( int numberRoom, float dailyPrice){
        super(numberRoom, dailyPrice);
    }

    public float calculateDailyPrice(){
        return this.dailyPrice * (1-this.customer.discountPercentage());
    }
}
