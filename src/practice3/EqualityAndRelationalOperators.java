package practice3;

public class EqualityAndRelationalOperators {
    // = equal to
    // != not equal to
    // > greater than
    // >= greater than equal
    // < less than
    // <= less than equal

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 40;

        if (num1 == num2) {
            //the condition looks for true or false value
            //if this condition is false, it will not print it
            //if its true, if block will execute, else it wil not
            //it didnt print anything since its not true
            System.out.println("num1 and num2 is equal");
        }
            //this a relational operator num1=num2(comparing variables.
        if (num1 != num2){
            System.out.println("num1 and num2 is not equal");
        }
        if (num1 > num2){
            System.out.println("num1 is greater than num2");
            //this condition is false then it will not execute
            }
        if (num1 < num2) {
            System.out.println("num1 is less than num2");
            //this condition is true it will execute
        }
        if (num1 >= num2) {
            System.out.println("num1 is greater than equal num2");
            //this means that it will start counting from 31 to 40
            //this condition is false it will not execute
        }
        if (num1 <= num2) {
            System.out.println("num1 is less than equal num2");
            //this condition is true it will execute
        }
        }
    }


