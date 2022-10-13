package class18;


// Classes can be created whenever

//ONLY ONE COMMON CLASS THAT SHOULD HAVE THE
public class Car{ // AKA common, parent, base, super
    //Common classes in all other classes

    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    //if a field or method has private access modifier in parent class child class cannot use it
    private String engineType;

    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}
 class BMW extends Car {
     double engineCC;


 }

class Tesla extends Car {
}

class Toyota extends Car {
    double engineCC;
}

class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x5M";
        bmw.engineCC=200;
        bmw.printCarDetails();

    }
    }

