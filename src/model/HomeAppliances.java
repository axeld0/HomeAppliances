package model;

public class HomeAppliances {
    private double basePrice;
    private String color;
    private char energyConsumption;
    private double weight;


    /**
     * constructors
     */

    //1.
    public HomeAppliances()
    {
        basePrice = 100;
        color = "White";
        energyConsumption = 'F';
        weight = 5;
    }

    //2.

    public HomeAppliances(double basePrice, double weight)
    {
        this.basePrice = basePrice;
        this.color = "White";
        this.energyConsumption = 'F';
        this.weight = weight;
    }

//3.
    public HomeAppliances(double basePrice, String color, char energyConsumption, double weight) {
        this.basePrice = basePrice;
        this.color = checkColor(color);
        this.energyConsumption = checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }




    /**
     * getters
     */
    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public double getWeight() {
        return weight;
    }


    /**
     *method that checks energy consumption.
     */
    public char checkEnergyConsumption (char letter)
    {
        char category = '\0';
        if (letter == 'A' || letter == 'B' || letter == 'C' || letter == 'D' || letter == 'E' || letter == 'F')
        {
            category = letter;
        }
        else
        {
            category = 'F';
        }
        return  category;
    }


    /**
     * CHECKS THE COLOR OF THE APPLIANCES. IF NOT CORRECT,THEN IS WHITE.
     * @param color given.
     * @return color of the appliance.
     */
    public String checkColor (String color)
    {
        String modelColor = "";
        if (color.equals("White") || color.equals("Black") || color.equals("Red") || color.equals("Blue") || color.equals("Grey"))
        {
            modelColor = color;
        }
        else {
            modelColor = "White";
        }
        return modelColor;
    }


    /**
     * GIVES THE FINAL PRICE OF THE APPLIANCE ACCORDING TO ENERGY CONSUMPTION AND WEIGHT.
     * @return THE FINAL PRICE
     */
    public double finalPrice ()
    {
        double fPrice = 0;
        switch (energyConsumption)
        {
            case 'A':
                fPrice +=100;
                break;
            case 'B':
                fPrice +=80;
                break;
            case 'C':
                fPrice +=60;
                break;
            case 'D':
                fPrice +=50;
                break;
            case 'E':
                fPrice +=30;
                break;
            case 'F':
                fPrice +=10;
        }

        if(weight >0 && weight< 20) {fPrice +=10;}
        else if (weight >=20 && weight < 50) {fPrice += 50;}
        else if (weight > 50  && weight < 80){fPrice += 80;}
        else if (weight >= 80){fPrice +=100;}

        return fPrice;
    }


    @Override
    public String toString() {
        return "HomeAppliances{" +
                "basePrice=" + basePrice +
                ", color='" + color + '\'' +
                ", energyConsumption=" + energyConsumption +
                ", weight=" + weight +
                '}';
    }
}
