package ovning12;

public class Person {
    private String namn, adress;
    private int ålder;

    protected Person(String namn, String adress, int ålder) {
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }
}
