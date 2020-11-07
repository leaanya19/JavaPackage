package practice2;

public class LearnMethod {
    //method is block of codes which run when they are called.
    //method is used to perform certain actions and they are known as functions
    //types of method:
    //return type/non return type
    //return method without parameter
    //return method with parameter
    //non return method with parameter
    //non return method without parameter
    //methodsyntax: accessModifier return type/methodtype methodName (){ method body
    //}//hard coding is when we directly assign values
    //returnType/dataType: dataType/classType
    //methodName: verb+noun

public int doSubstraction(int num1, int num2){
    int number1=num1;
    int number2=num2;
    int sub=number2-number1;
    System.out.println("Substraction value is "+sub);
    return sub;//return type method with parameter

}
    //to make a dynamic values we need to parametrize the data
    //return type of data or class type or object
    public int doSummation() {
        int number1=20;
        int number2=30;
        int sum=number1+number2;
        System.out.println("Summation value is "+sum);//return type without parameter
        return sum; //this line must be at last, otherwise it will show error
    }


    public static void stInfo(){
        System.out.println("Students information");
        System.out.println("Students information");
        System.out.println("Students information");
        System.out.println("Students information");
    }
    //instead of printing the above line again just call it as it shows below:

    public static void main(String[] args) {
        LearnMethod.stInfo();
        LearnMethod.stInfo();

        LearnMethod obj=new LearnMethod();
        obj.doSummation();

        LearnMethod Obj=new LearnMethod();
        obj.doSubstraction(30,200);
        obj.doSubstraction(20,400);
        obj.doSubstraction(33,210);
        obj.doSubstraction(50,500);









    }



}

