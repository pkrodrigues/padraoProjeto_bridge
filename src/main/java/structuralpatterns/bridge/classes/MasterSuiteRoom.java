package structuralpatterns.bridge.classes;

public class MasterSuiteRoom extends Room{
    private float serviceFees;
    public MasterSuiteRoom( int numberRoom, float dailyPrice){
        super(numberRoom, dailyPrice);
    }

    public void setServiceFees(float serviceFees) {
        this.serviceFees = serviceFees;
    }

    public float calculateDailyPrice(){
        return this.dailyPrice * (1-this.customer.discountPercentage())+serviceFees;
    }
}

