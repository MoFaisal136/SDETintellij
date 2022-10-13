package class19;

//Hierarchical

class Vehicle{  //GRANDPARENT CLASS
    int numOfWheels;
    int topSpeed;
}

public class Car extends Vehicle{// PARENT CLASS
    String model;
    String make;
    int year;
}

class Tesla extends Car{ //Child class

}


/*MULTILEVEL INHERITANCE
DIAMOND PROBLEM NOT ALLOWED
Electrical car plus gas car
class CustomCar extends Toyota, Tesla{

}
*/