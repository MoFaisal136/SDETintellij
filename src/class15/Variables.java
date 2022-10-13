package class15;

public class Variables {

    String name; //instance

    static int noOfLegs=4; //static

    void bark(){
        int i=10;   //local
        for(int j = 0; j<i; j++){
            //j is local
            System.out.println("Barking....");
        }
    }
}
