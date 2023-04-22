import model.HomeAppliances;
import model.WashingMachine;
import model.TV;

public class Main {
    public static void main(String[] args) {

        HomeAppliances [] ha = new HomeAppliances[10];
        ha[0] = new TV(150, 20);
        ha[1] = new TV(293, 50);
        ha[2] = new TV(150, 234);
        ha[3] = new TV(150,"Blue", 'A', 123, 60, true);
        ha[4] = new TV();
        ha[5] = new WashingMachine();
        ha[6] = new WashingMachine(200, 100);
        ha[7] = new WashingMachine(200,"Red", 'C', 123, 30);
        ha[8] = new WashingMachine();
        ha[9] = new WashingMachine();

        double tvTotal = 0;
        double wmTotal = 0;
        double totalTotal = 0;

        for(int i = 0 ; i < ha.length ; i++)
        {
            System.out.println((i+1)+"--"+ha[i]);
            if(ha[i] instanceof TV)
            {
                tvTotal += ha[i].finalPrice();
            }
            else
            {
                wmTotal +=ha[i].finalPrice();
            }
            totalTotal+=ha[i].finalPrice();
        }
        System.out.println("total tv $$" + tvTotal);
        System.out.println("total Washing Machines : $$" +wmTotal);
        System.out.println("Total : $$" + totalTotal);

    }
}