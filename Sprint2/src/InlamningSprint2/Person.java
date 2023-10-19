package InlamningSprint2;

import java.time.LocalDate;

public class Person {
    String peronnummer; //format 10 siffror utan bindestreck
    String namn;

    public void setPeronnummer(String peronnummer) {
        this.peronnummer = peronnummer;
    }

    LocalDate medlemskapDatum; //fotmat YYYY-mm-dd

    public Person(String peronnummer, String namn, LocalDate medlemskapDatum) {
        this.peronnummer = peronnummer;
        this.namn=namn;
        this.medlemskapDatum =medlemskapDatum;
    }

    public String getPeronnummer() {
        return peronnummer;
    }

       public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public LocalDate getMedlemskapDatum() {
        return medlemskapDatum;
    }

    public void setMedlemskapDatum(LocalDate medlemskapDatum) {
        this.medlemskapDatum = medlemskapDatum;
    }
}
