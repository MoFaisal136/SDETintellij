package class18;

public class Animal {
    // putting common variables in all the animal classes
    //COMMON CLASSES Horse, Dog, Cat

    //public class Dog extends Animal{}

   protected String name;
    String breed;
    int age;
    double weight;

    void printInfo(){
        String name = "now this will be printed";
        System.out.println("Name "+ name+" Breed "+breed+ " age "+age+" weight "+ weight);
    }


}
