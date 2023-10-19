package ovning8;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ovning8 {
    public static void main(String[] args) {

        int x=0;
        double s;
        //String s ;
        double [] l = new double[100];
        //ArrayList l = new ArrayList<Double>();
        //Path p = Paths.("://src/ovning8/temp.txt");
        try (Scanner br = new Scanner(new FileReader(".//src/ovning8/temp.txt"))){
                //BufferedReader br = new BufferedReader(new FileReader(".//src/ovning8/temp.txt"))
            //BufferedReader br = new BufferedReader(new FileReader("://src/ovning8/temp.txt"));

            while (br.hasNextLine()){
                l[x]= Double.parseDouble(br.nextLine());
                //l[x]=Double.parseDouble(s);
                x++;
            }
            System.out.println(l);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();}
        double max=0;
        double min=100;
        double sumOfAll=0;

        for (int i =0; i<x;i++){
            if (l[i]>max)
                max= l[i];
            if (l[i]<min)
                min= l[i];
            sumOfAll += l[i];
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("average: " + sumOfAll/x);



    }
}
