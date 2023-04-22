package model;

public class WashingMachine extends HomeAppliances{
    private double charge;



    /**
     * CONSTRUCTORS
     */
    public WashingMachine() {
        this.charge = 5;
    }

    public WashingMachine (double basePrice, double weight)
    {
    super(basePrice, weight);
    this.charge = 5;
    }

    public WashingMachine (double basePrice, String color, char energyConsumption, double weight, double charge)
    {
        super(basePrice, color, energyConsumption, weight);
        this.charge = charge;
    }


    /**
     * getter
     */
    public double getCharge() {
        return charge;
    }

    /**
     * GIVES YOU THE FINAL PRICES. OVERRIDES THE .SUPER METHOD
     */

    @Override
    public double finalPrice()
    {
        double fp = super.finalPrice();
        if(charge > 30)
        {
            fp+= 50;
        }
        return fp;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "WashingMachine{" +
                "charge=" + charge +
                "\t\t\t\t\t\tFINALPRICE = " +finalPrice()+
                "} " ;
    }
}

