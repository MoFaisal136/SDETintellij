package class17;

public class Task1 {
    /*
        Create a method that will accept an array as parameters
        and will return a sum of all elements from that array.

(DEFAULT)->   Method should be visible only within same package and accessible
        by the creating an instance of the class.
         */


    int sumArray(int []arr){
        int sum=0;
        for (int num: arr){ //WILL ALLOW ARRAY TO PASS
            sum+=num;
        }
        return sum;
    }



}
