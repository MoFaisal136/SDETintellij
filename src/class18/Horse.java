package class18;
public class Horse extends Animal{



    //USE -> this <- when local var name and instance var name are the same
    public Horse(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
        void printInfo(){
            String name = "now this will be printed";
            System.out.println("Name "+ name+" Breed "+breed+ " age "+age+" weight "+ weight);
        }




    public static void main(String[]args){
    Horse horseObj = new Horse("Roach", "Stud", 20, 4000);
    horseObj.printInfo();

    }
}
