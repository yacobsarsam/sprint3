package ovning12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize {

    void Deserialize() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".//src/ovning12/spara.ser"))) {

            Object bil1 = ois.readObject();
            Fordon tåg1 = (Fordon) ois.readObject();
            Fordon båt1 = (Fordon) ois.readObject();
            Fordon cykel1 = (Fordon) ois.readObject();


            if (bil1 instanceof Fordon)
                ((Fordon) bil1).printMe();
            tåg1.printMe();
    cykel1.printMe();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

