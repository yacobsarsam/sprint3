package Serialisering;

import java.io.Serializable;

public class Person implements Serializable {
   private String namn;

    public Person(String namn) {
        this.namn =namn;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
}
