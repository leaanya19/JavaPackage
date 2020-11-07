package practice4controlflow;

public class LearnIfElse {
    //if(condition){} is a statement to control our data flow
    //if condition is true it will execute if block
    // if condition is false it will execute else block
    //cntrl+shift+f = format code

    public static void main(String[] args) {
        //if(condition){ statement }

       int age=15;// if i change the age to 20 that is 20>18
       if(age>18) {//if this condition is true it will execute the next block(its not)
           System.out.println("you are eligible for vote");//18>18 not true
           //if we change it to 15 it will also not execute
       } else { //if the condition is not true it will look for else block
           System.out.println("hey you are not eligible for vote");

       }



    }

}
