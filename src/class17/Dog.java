package class17;

public class Dog {

    //alt+click and replace new object
    //constructor uses class name to create simpler assigning and less code

    private String name;
    private String breed; // PRIVATE MAKES SURE FIELDS ENTERED ARE REASONABLE
    private String color;
    private int age;
    private double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){
        name = dogName;
        breed= dogBreed;
        color=dogColor;
        if(dogAge>30){
            System.out.println("ENTER VALID");
        } else {
            age = dogAge;
        }
        weight=dogWeight;
    }
void printInfo(){
    System.out.println(name+breed+age);
}

    public static void main(String[] args) {
        Dog dog =new Dog("Spike", "Mut", "Gray", 36, 23);
    }
}
