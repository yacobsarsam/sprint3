package ovning2;

import ovning4.Concumption;
import ovning4.Input;
import ovning4.Mil;

public class Main {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
       Input i = new Input();
        i.Readinput();
        Mil m = new Mil();
        int AntalMilInYear = m.GetNumberOfMilInYear(i.milToday,i.milYerAgo);
        Concumption c = new Concumption();
        s.append("Antal körda mil: ").append(AntalMilInYear).append("\nAntal liter bensin: ")
                .append(i.consumedliterPerYear).append("\nFörbrukning per mil: ").append(c.CalculateConcumptionPerMil(i.consumedliterPerYear,AntalMilInYear));
        System.out.println(s);
                /*"Antal körda mil: " + AntalMilInYear +
        "\nAntal liter bensin: " + i.consumedliterPerYear +
        "\nFörbrukning per mil: "
                + c.CalculateConcumptionPerMil(i.consumedliterPerYear,AntalMilInYear));*/


    }
}