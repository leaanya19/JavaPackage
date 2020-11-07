package practice3;

public class ArithemeticOperator {
    // + Arithemetic Operator
    // - Substraction Operator
    // * Multiplication
    // / devision
    // % Remainder

    public static void main(String[] args) {
        int num1=70;
        int num2=20;
        int summation=num1+num2;
        System.out.println("summation");

        int substraction=num1-num2;
        System.out.println("substraction");

        int multiplication=num1*num2;
        System.out.println("multiplication");

        int devision=num1/num2;
        System.out.println("multiplication value is "+devision);

        //70/20 = 3 . 70-60 = 10// the remaining value after devision is the remainder
        int remainder=num1 % num2;
        System.out.println("remainder value is "+remainder);

        double num3 = 30.5;
        double num4 = 20;
        double remainder1= num3 % num4;
        System.out.println("remainder value is "+remainder1);



    }
}
