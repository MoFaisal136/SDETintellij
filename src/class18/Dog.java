package class18;
public class Dog extends Animal{



    String color;

    double height;

    // right click generate constructor
    public Dog(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    public Dog(String name, String breed, String color, int age, double weight, double height) {
      /*  this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
        this(name, breed, color, age, weight);// repeats everything w/o rewriting
        this.height = height;// adding this line
    }

}

