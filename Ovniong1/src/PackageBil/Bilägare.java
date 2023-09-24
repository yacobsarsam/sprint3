package PackageBil;

import PackagePerson.Person;

import java.util.ArrayList;

public class Bilägare extends Person {
private ArrayList<Bil> bilar= new ArrayList<>();
    public Bilägare(String namn, String adress, int ålder) {
        super(namn, adress, ålder);
    }
    /*public static void BytabilÄgare(Bil bil1, Bilägare p1, Bilägare p2) {
        bil1.setÄgare(p2) ;

        p1.TaBortBil(bil1);
        p2.AddBil(bil1);
    }*/

    public static void KöpBil(Bil bil1, Bilägare p2) {
        bil1.setÄgare(p2) ;
        p2.AddBil(bil1);
    }

    public static void SäleBil(Bil bil1, Bilägare p1) {
        p1.TaBortBil(bil1);
        }
    private void AddBil(Bil bil) {
        bilar.add(bil);
    }

    private void TaBortBil(Bil bil) {
        bilar.remove(bil);

            }

    public String getBilarReg() {
        String s="";
        for(int i=0;i<bilar.size();i++)
            s=s + " "+ bilar.get(i).getRegistreringsnummer();
        return s;
    }

    public ArrayList<Bil> getBilar() {

        return bilar;
    }

    public void setBilar(ArrayList<Bil> bilar) {
        this.bilar = bilar;
    }

}

