package practice2;

public class LearnMethodd {
    //return type with dynamic parameterization

    public String stInfo(String fName,String lName,int age,int birthYear){
        String fullName=fName+""+lName;
        System.out.println("Full Name: "+fullName+ "Age "+age+ "birthYear "+birthYear);
        return fullName;
    }

    public void doMultiplication(){// non return type method//non dynamic
        int number1=20;
        int number2=30;
        int multiply =number1*number2;
        System.out.println("The Multiplication value is " +multiply);
    }
    public void doMultiplication(int number1, int number2){
        // non return type method//parametrized dynamic//the values are dynamic
        int multiply =number1*number2;
        System.out.println("The Multiplication value is " +multiply);
    }
    public void doDevision(double num1, double num2){
        double devision=num2/num1;
        System.out.println("The devision value is "+devision);

    }


    public static void main(String[] args) {
        LearnMethodd obj= new LearnMethodd();
        obj.stInfo("James","Williams",26,1993);
        obj.doMultiplication();
        obj.doMultiplication(40,10);
        obj.doDevision(30,90);



        }


    }
