package InlamningSprint2;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class IOUtility {
    private ArrayList<Person> listOfersons = new ArrayList<>();
    PersonUtility pu = new PersonUtility();

    public ArrayList<Person> ReadFromFileToList(Path inPath) {
        String firstLine, secondLine;
        String pn, namn;
        LocalDate date;

        try (Scanner scan = new Scanner(inPath)) {
            while (scan.hasNext()) {
                firstLine = scan.nextLine();
                secondLine = scan.nextLine().trim();
                pn = firstLine.substring(0, 10).trim();
                namn = firstLine.substring(11).trim();
                date = LocalDate.parse(secondLine);
                listOfersons.add(pu.GreatePerson(pn, namn, date));
                //pu.AddPersonToList(pu.GreatePerson(pn, namn, date), pu.getListOfersons());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfersons;
    }

    public void WriteToFile(Person person, Path outPath) {
        if (!Files.exists(outPath)) {
            try {
                Files.createFile(outPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (BufferedWriter br = Files.newBufferedWriter(outPath, StandardOpenOption.APPEND)) {
            br.write(person.getPeronnummer() + ", " + person.getNamn() + ", " + LocalDate.now());
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ReadFromUser(Path outPath) {
        Scanner sc = new Scanner(System.in);
        // String wrongMessage = "";
        String input;
        while (true) {
            System.out.println("Skriv personnummer (10 siffror) eller namn på tränare: ");
            if (!sc.hasNext())
                System.exit(0);
            if (sc.hasNextLine()) {
                input = sc.nextLine();
                Person person = pu.GetPersonFromList(input, input, listOfersons);
                CheckHistoricMemberhip(person, outPath);
            }
        }
    }
    void CheckHistoricMemberhip(Person person, Path outPath) {
        if (person == null) {
            System.out.println("Tränare har inte varit medlem tidigare");
        } else if (pu.HasActiveMembership(person)) {
            WriteToFile(person, outPath);
            System.out.println("Kunden är en nuvarande medlem");
        } else if (!pu.HasActiveMembership(person)) {
            System.out.println("Kunden är en före detta kund");
        }
    }
    public ArrayList<Person> getListOfersons() {
        return listOfersons;
    }
    public void setListOfersons(ArrayList<Person> listOfersons) {
        this.listOfersons = listOfersons;
    }
    /*public boolean isTenDigits(String input) {
        int length = input.length();
        if (length != 10)
            return false;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }*/
    /*private boolean correctInput(String input) {
        if (!isTenDigits(input)) {
            return false;
        } else return true;
    }*/
}