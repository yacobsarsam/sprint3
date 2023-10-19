package ovning3;

import java.util.Scanner;

public class Ovning3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter mening:");

            String s = scan.nextLine();

            if (s.trim()!="")
                System.out.println("Du skrev: " + s);

        }
}
}
