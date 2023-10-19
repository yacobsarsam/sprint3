package ovning9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtil {

    public static void ReadToPath(List<Person> långPres, Path utPath) {


        try (BufferedWriter bw = Files.newBufferedWriter(utPath)) {
            if (!Files.exists(utPath))
                Files.createFile(utPath);
            for (Person pers: långPres){
                StringBuilder s = new StringBuilder();
                s.append(pers.getName()+", ");
                s.append(pers.getStreet()+", ");
                s.append(pers.getCity()+"\n");
                s.append(pers.getAge()+", ");
                s.append(pers.getWeight()+", ");
                s.append(pers.getLength()+"\n");
                bw.write(s.toString());

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }}
    public List<Person> readFromPath(Path inPath) {
        List<Person> listOfPersons = new ArrayList<>();
        String firstrow = "";
        String secondrow = "";
        //Path path = Paths.get(".//src/ovning9/Personuppgifter.txt");

        try (Scanner br = new Scanner(inPath)) {

            //BufferedReader br = new BufferedReader(new FileReader("://src/ovning8/temp.txt"));

            while (br.hasNextLine()) {
                firstrow = br.nextLine();
                secondrow = br.nextLine();
                String[] firstArr = firstrow.split(",");
                String[] secondArr = secondrow.split(",");
                Person p = new Person(firstArr[0].trim(), firstArr[1].trim(), firstArr[2].trim(),
                        Integer.parseInt(secondArr[0].trim()),
                        Integer.parseInt(secondArr[1].trim()),
                        Integer.parseInt(secondArr[2].trim()));
                listOfPersons.add(p);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfPersons;
    }
}


