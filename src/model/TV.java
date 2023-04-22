package model;

public class TV extends HomeAppliances{
    private int resolution;
    private boolean TDTSintonizer;


    /**constructors
     */

    public TV()
    {
       resolution = 20;
       TDTSintonizer = false;
    }

    public TV(double basePrice, double weight)
    {
        super(basePrice, weight);
        resolution = 20;
        TDTSintonizer = false;
    }

    public TV(double basePrice, String color, char energyConsumption, double weight, int resolution , boolean TDTSintonizer)
    {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.TDTSintonizer = TDTSintonizer;
    }

    /**
     * getters
     */

    public int getResolution() {
        return resolution;
    }

    public boolean isTDTSintonizer() {
        return TDTSintonizer;
    }

    @Override
    public double finalPrice()
    {
        double fp = super.finalPrice();

        if(resolution > 40) {
            fp+= (fp * 0.30);
        }
        if(TDTSintonizer == true)
        {
            fp += 50;
        }
        return fp;
    }

    @Override
    public String toString() {
        return super.toString()+
                "TV{" +
                "resolution=" + resolution +
                ", TDTSintonizer=" + TDTSintonizer +
                ",\t\t\tFINALPRICE = " + finalPrice() +
                '}';
    }
}
