package Ovning2;

public class MainOvning4 {
    public static void main(String[] args) {

       Input i = new Input();
        i.Readinput();
        Mil m = new Mil();
        int AntalMilInYear = m.GetNumberOfMilInYear(i.milToday,i.milYerAgo);
        Concumption c = new Concumption();

        System.out.println("ssdAntal körda mil: " + AntalMilInYear +
        "\nAntal liter bensin: " + i.consumedliterPerYear +
        "\nFörbrukning per mil: "
                + c.CalculateConcumptionPerMil(i.consumedliterPerYear,AntalMilInYear));

    }
}