package ovning9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ovning9 {
    public static void main(String[] args) {

        Path path = Paths.get(".//src/ovning9/Personuppgifter.txt");
        IOUtil oi = new IOUtil();
        List<Person> l = new ArrayList<>(oi.readFromPath(path));
        Hanterare h = new Hanterare();
        Path utPpath = Paths.get(".//src/ovning9/NewPersonuppgifter.txt");
        oi.ReadToPath(h.getTallPeopleList(l),utPpath);







    }



}