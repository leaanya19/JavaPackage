package homework;

public class LearnForeighLanguages {
    public LearnForeighLanguages() {

    }

    //constructor is used to initialize the object
    public static void main(String[] args) {


        LearnForeighLanguages learnForeighLanguages = new LearnForeighLanguages();
        learnForeighLanguages.Cookmeals("Jane Mayrin","Brooklyn NY", 27);
    }
        String name;
        String address;
        int age;

       public void Cookmeals(String name) {
            this.name = name;

        }

    public void Cookmeals(String name,String address,int age){
          this.name=name;
          this.address=address;
          this.age=age;
        System.out.println(this.name+""+this.address+""+this.age);

    }
    public LearnForeighLanguages(int number,String place,String location){


    }

    }

