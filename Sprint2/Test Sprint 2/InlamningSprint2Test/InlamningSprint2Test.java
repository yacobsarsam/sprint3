package InlamningSprint2Test;

import InlamningSprint2.Gym;
import InlamningSprint2.IOUtility;
import InlamningSprint2.Person;
import InlamningSprint2.PersonUtility;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class InlamningSprint2Test {
    PersonUtility pu = new PersonUtility();
    IOUtility iou = new IOUtility();
    String pn = "6655442211";
    String namn = "Yacoub Sarsam";
    LocalDate memberDate = LocalDate.parse("2022-10-01");
    Person p1 = new Person(pn, namn, memberDate);
    Person p2 = new Person("9988776543", "Sara", LocalDate.parse("2023-09-15"));
    ArrayList<Person> inskrivnaPersoner = new ArrayList<>();

    @Test
    void FinnsPersoniListTest() {
        inskrivnaPersoner.add(p1);
        assert (pu.GetPersonFromList(pn, namn, inskrivnaPersoner).getPeronnummer().equals(pn));
    }

    @Test
    void HasActiveMembershipTest() {
        assert (pu.HasActiveMembership(p2));
        assert (!pu.HasActiveMembership(p1));
    }

    @Test
    void ReadFromFileTest() {
        //assert(iou.ReadFromUser());
        Path testPath = Paths.get("src/InlamningSprint2/TestReadCustomers.txt");
        //Throwable exception = assertThrows(Exception.class,() ->iou.ReadFromFileToList(path));
        ArrayList<Person> list = iou.ReadFromFileToList(testPath);
        assertEquals(list.size(), 3);
        assertEquals(list.get(0).getNamn(), "Yacoub Sarsam");
        assertEquals(list.get(1).getPeronnummer(), "9977551234");
        assertEquals(list.get(2).getNamn(), "Noor Munir");
    }

    @Test
    void WriteToFileTest() {
        int antalAktivaMedlemer = 0;
        ArrayList<Person> writeTestList = new ArrayList<>();
        Person activePerson = null;
        Path readPath = Paths.get("src/InlamningSprint2/TestReadCustomers.txt");
        Path writetPath = Paths.get("src/InlamningSprint2/TestWriteCustomers.txt");
        try (PrintWriter pr = new PrintWriter(Files.newBufferedWriter(writetPath)); Scanner scan = new Scanner(writetPath)) {
            /*while (scan.hasNextLine()) {
                scan.nextLine();
                antalAktivaMedlemer++;
            }*/
            writeTestList = iou.ReadFromFileToList(readPath);
            for (int i = 0; i < writeTestList.size(); i++) {
                Person pTest = writeTestList.get(i);
                if (pu.HasActiveMembership(pTest)) {
                    iou.WriteToFile(pTest, writetPath);
                    antalAktivaMedlemer++;
                    activePerson = pTest;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(countLinesInFile(writetPath) == antalAktivaMedlemer);
        assertFalse(countLinesInFile(writetPath) == antalAktivaMedlemer - 1);

        if (activePerson != null)
            assertEquals(activePerson.getPeronnummer(), writeTestList.get(0).getPeronnummer());
    }
    String ReadLastPersonFromOutpuFile(Path writePath) {
        String personNumber = null;
        try (Scanner scan = new Scanner(writePath)) {
            while (scan.hasNextLine()) {
                personNumber = scan.nextLine();
                personNumber = personNumber.substring(0, 10).trim();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personNumber;
    }

    private int countLinesInFile(Path fileToCountPath) {
        int antallines = 0;
        try (BufferedReader b = new BufferedReader(new FileReader(fileToCountPath.toString()))) {
            while (b.readLine() != null)
                antallines++;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return antallines;
    }

    @Test
    void DoProgramTest() {
        boolean isTest = true;
        Path readPath = Paths.get("src/InlamningSprint2/TestReadCustomers.txt");
        Path writetPath = Paths.get("src/InlamningSprint2/TestWriteCustomers.txt");
        Gym g = new Gym();
        g.DoProgram(isTest, "8877664321", readPath, writetPath);
        assertEquals(ReadLastPersonFromOutpuFile(writetPath), ReadLastActiveMedlemFromInputFile(readPath));
    }
    String ReadLastActiveMedlemFromInputFile(Path readPath) {
        ArrayList<Person> personer = iou.ReadFromFileToList(readPath);
        for (int i = personer.size() - 1; i >= 0; i--) {
            if (pu.HasActiveMembership(personer.get(i)))
                return personer.get(i).getPeronnummer();
        }
        return null;
    }
    /* @Test
    void AddPersonToListTest(){
            //Person p2 = new Person("9988776543","Sara",LocalDate.parse("2023-09-15"));
            inskrivnaPersoner.add(p1);
            assert ("9988776543".equals(pu.AddPersonToList(p2, inskrivnaPersoner).get(1).getPeronnummer()));

        }*/

    /*@Test
    void isTenDigitsTest() {
        IOUtility iou = new IOUtility();
        assert (iou.isTenDigits("1234567890"));
        assert (!iou.isTenDigits("a123456789"));
        assert (!iou.isTenDigits("123456789"));
    }*/
}