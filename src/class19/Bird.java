package class19;
//*********************************************************************************
public class Bird {
    String name;
    String color;
    int age;
    double weight;
Bird(String name, String color, int age, double weight) {
    this.name = name;
    this.age = age;
    this.color = color;
    this.weight = weight;
}
    void printInfo(){
        System.out.println("Name "+name+ " Color "+color+" Age "+age+" Weight "+weight);
    }

}
//****************************************************************************************



class Parrot extends Bird {
    Parrot(String name, String color, int age, double weight){  //<--CONSTRUCTOR
        super(name, color, age, weight);
      /*  this.name=name;
        this.age= age;
        this.color=color;
        this.weight=weight;*/
    }

}
//**********************************************************************************


class Crow extends Bird{
    Crow(String name, String color, int age, double weight){        //<--CONSTRUCTOR
        super(name, color, age, weight);
    }

}
//************************************************************************************

class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Iago", "Red", 5, 2);
        parrot.printInfo();

        Crow crow=new Crow("Shisui", "Black", 3, 1);
        crow.printInfo();
    }
}
