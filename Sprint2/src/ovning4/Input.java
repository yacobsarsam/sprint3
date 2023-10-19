package ovning4;

import javax.swing.*;
import java.util.Scanner;

public class Input {
    public int milToday;
    public int milYerAgo;
    public int consumedliterPerYear;
    public void Readinput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Mil today?");
        milToday = s.nextInt();
        System.out.println("Mil one year ago?");
        milYerAgo = s.nextInt();
        System.out.println("Consumed liters under last year?");
        consumedliterPerYear = s.nextInt();




    }
}
