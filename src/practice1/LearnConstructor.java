package practice1;

public class LearnConstructor {

//Constructor is the same as class name
    //it has no return type
    //it is used to initialize the object
    //we must create default constructor before creating parametrize constructor
//Default/no n parametrized constructor(default is used to create the object
    //when creating the object you do not need any default constructor
    //D.C is also created automatically by JDK even if we do not create it.
    //we need D.C when we have multiple parametrized constructors
    //when create constructor it is parameterization
    //when we create values it is an argument passing

    String name;
    String address;
    int year;
    Double coursefee;


    public LearnConstructor(){
        System.out.println("Hey, this is default constructor");
        System.out.println("i find constructor easy to understand");
    }
    //Default Constructor

    //parametrized constructor
    public LearnConstructor(String name) {  //single parameterization
        this.name = name;
        System.out.println(this.name+""+this.address);
        //constructor is a kind of a method but not a method
    }

    public LearnConstructor(String name, String address, int year) { //multiple parameterization
        this.name = name;
        this.address = address;
        this.year=year;
        System.out.println(this.name+""+this.address+""+this.year);

    }

    public static void main(String[] args) {
        //inialize/create the object
        //1st object with single parameterization
        LearnConstructor learn = new LearnConstructor("Wiiliam John");
        //2nd object with multiple parameterization
        LearnConstructor arib=new LearnConstructor("Arib Anderson","Brooklyn,NY",2020);
        // i need to understand this too before practicing it


        LearnConstructor dc=new LearnConstructor();
        LearnConstructor raza=new LearnConstructor();

    }
}