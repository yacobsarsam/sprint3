package Serialisering;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

    public class Deserialise {
        public static void main(String[] args) {
            Deserialise s = new Deserialise();
        }
        public Deserialise() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Serialisering/spara.ser"))) {

                Object p1 = ois.readObject();
                Object p2 = ois.readObject();
                if(p1 instanceof Person)
                    System.out.println(((Person) p1).getNamn());
                System.out.println(((Person)p2).getNamn());
            }
            catch(Exception e) {
                e.printStackTrace();
            }

        }



}
