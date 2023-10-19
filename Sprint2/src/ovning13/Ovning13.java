package ovning13;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ovning13 {
     Ovning13() {
         double a,b,reslut;
         String operator;

         Calculator c = new Calculator();
         String resultString = "";
         while (true){

       try {
            System.out.println(resultString+"Insert  int, int then operator");
           Scanner s = new Scanner(System.in);
           System.out.println("First int: ");
           //a = s.nextInt();
           a=c.ParseToInt(s.next().trim());
           System.out.println("Second int: ");
           b = s.nextInt();
           System.out.println("operation: ");
           operator = s.next();
           reslut = c.Calculate(a,b,operator);
           System.out.println(reslut);

       }catch (InputMismatchException e){
           resultString = "Fel format på indata. ";
       }
       catch (NoSuchElementException e){
           resultString ="Kunde inte läsa indata. ";
       }
       catch (ArithmeticException | OperatorNotSupportedException e){
           resultString = e.getMessage();
       }
         }
     }


    public static void main(String[] args)  {
        Ovning13 o = new Ovning13();

    }
}