package practice3;

public class LearnRecursion {
    //process which a method calls itself continuously
    //the method must call itself
    //it must have a base case
    //it must change its sate and move toward the base case
    //recursion is a continuous process that works like loop

    int count;//still not working
    //try to inialize the variable but start with zero
    int count1=0;//its also starting from zero by default(it doesnt matter)
    //we need to create a condition

    public void stInfo(){
        count++;
        if(count <=5){ //in this "if"condition its no controlled while running
            System.out.println("Teacher name is William");
            stInfo();
        }
    }
    //you can call the method in the same method, and it will run by having a base case
    public static void main(String[] args) {
        LearnRecursion obj=new LearnRecursion();
        obj.stInfo();
        //in this case it is runing thousands of codes and show as error
        //to fix that we need to create a global variable

    }
}
