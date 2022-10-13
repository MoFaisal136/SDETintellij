package class18;

public class Cat extends Animal{

    private String name;
    private String breed;
    private int age;
    private double weight;

    public Cat(String catName, String catBreed, int catAge, double catWeight) {
        name = catName;
        breed = catBreed;
        age = catAge;
        weight = catWeight;
    }


    public void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight" + weight);
    }




}
