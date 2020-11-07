package practice3;

public class ConditionalOperator {

    //conditional operator comes with two values:
    //conditional with And: all condition have to be true
    //conditional with OR: if one condition is true then block of code will execute
    //we can put multiple conditions at a time by using "And"or "Or" operators
    //pipe
    //false || false = false
    //false || true = true
    //true || false = true
    //true || true = true


    public static void main(String[] args) {
        int num1=65;
        int num2=50;
        if (num1 == num2){
            System.out.println("num1 and num2 are equal");
        }
        //all conditions have to be true
        if (num1==66 && num2==50){
            System.out.println("My best vaccation part in summer is swimmimg");
            //if we change with a false condition then it will not execute nothing
        }
        //with "or" if one condition is true then block of code will execute
        if (num1==66 || num2==50) {
            System.out.println("My best Hawai vaccation part the last summer was swimmimg");
            //if we change one side of condition (66) then it will execute since
            //still one side is true
        }
    }
}