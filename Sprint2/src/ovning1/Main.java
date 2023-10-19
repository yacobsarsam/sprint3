package ovning1;

import ovning4.Concumption;
import ovning4.Input;
import ovning4.Mil;

public class Main {
    public static void main(String[] args) {

       Input i = new Input();
        i.Readinput();
        Mil m = new Mil();
        int AntalMilInYear = m.GetNumberOfMilInYear(i.milToday,i.milYerAgo);
        Concumption c = new Concumption();

        System.out.println("Antal körda mil: " + AntalMilInYear +
        "\nAntal liter bensin: " + i.consumedliterPerYear +
        "\nFörbrukning per mil: "
                + c.CalculateConcumptionPerMil(i.consumedliterPerYear,AntalMilInYear));

        System.out.println("Hello world!");
    }
}