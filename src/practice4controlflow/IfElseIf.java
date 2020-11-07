package practice4controlflow;

public class IfElseIf {
    //in order to develop an application we use this kind of ifelseif condition

    public static void main(String[] args) {
        double score=50;
        if(score>=90){
            System.out.println("your grade is A+");
        } else if (score>=80){
            System.out.println("your grade is A");
        }else if (score>=70){
            System.out.println("your grade is B");
        }else if (score>=60){
            System.out.println("your grade is C");
        }else{
            System.out.println("your grade is F");
        }

    }
}
