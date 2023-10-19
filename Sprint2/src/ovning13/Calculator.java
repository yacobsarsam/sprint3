package ovning13;

public class Calculator {


     public int ParseToInt(String siffra){
        return Integer.parseInt(siffra);
    }
           boolean OperatorSupported(String operator) {
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
                return true;
            else return false;
        }
        public double Calculate(double a, double b, String operator1) throws OperatorNotSupportedException {

            if (!OperatorSupported(operator1))
                throw new OperatorNotSupportedException("Felaktig operator ");
         switch (operator1){
             case "+" -> {
                 return a+b;
             }
             case "-" -> {
                 return  a-b;
             }
             case "*" -> {
                 return  a*b;
             }
             case "/" -> {
                 if (b==0) {
                     throw new ArithmeticException("Kan not divide by zero! ");
                 }

                 return  a/b;
             }
         }
return 0;
    }}