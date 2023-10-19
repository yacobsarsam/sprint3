package ovning12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ovning12 {
    public void Serialize () {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".//src/ovning12/spara.ser"))){
            Bil bil1= new Bil(6,140, 1350,4);
            Tåg tåg1= new Tåg(10,400, 10000,4);

            Båt båt1= new Båt(1000, 50, 700);
            Cykel cykel1 = new Cykel(3,30,50);
            oos.writeObject(bil1);
            oos.writeObject(tåg1);
            oos.writeObject(cykel1);
            båt1=null;
            oos.writeObject(båt1);
            bil1=null;
            tåg1=null;
            cykel1=null;
            //båt1=null;


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
