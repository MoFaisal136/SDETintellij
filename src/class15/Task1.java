package class15;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Task1 {
    /*Create a method that will take 2 parameters as a numbers and
    prints which number is larger./
     */

    void printLar (int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Num1 is larger " + num1);
        } else if (num2 > num1) {
            System.out.println("Num2 is larger " + num2);

        } else {
            System.out.println("Nums are equal");
        }
    }
        public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter first number");
            int num1= scanner.nextInt();

            System.out.println("Please enter secomd number");
            int num2= scanner.nextInt();

        Task1 task1 = new Task1();
        task1.printLar(12, 36);
        task1.printLar(50, 12);
        task1.printLar(num1, num2);
        }



}
