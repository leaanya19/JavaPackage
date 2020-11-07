package practice4controlflow;

public class NestedIfElse {
    public static void main(String[] args) {
        int age=15;
        if (age>18) {//parent condition
            System.out.println("you are adult");//when it goes inside if block it will
            //first print the above line, then it will look for next line, then it will
            //look for the next condition(its not true)so it will not execute this if block
            //directly it will go to else block
            if (age > 24) {
                System.out.println("you are not youth");
                if (age > 22) {
                    System.out.println("you are 22+");
                } else {
                    System.out.println("you are below 22");
                }
            } else {
                System.out.println("you are not adult");//parent else

            }
        }
    }


}
