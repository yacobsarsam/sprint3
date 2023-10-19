package Serialisering;

import java.io.*;

public class Serialise {
    public static void main(String[] args) {
        Serialise s = new Serialise();
    }
    public Serialise() {
        Person p1 = new Person("Ziyad");
        Person p2 = new Person("Yacoub");
        try (ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(".//src/Serialisering/spara.ser"))) {

            oos.writeObject(p1);
            oos.writeObject(p2);
        }
        catch(Exception e) {
            e.printStackTrace();
                }

    }


}