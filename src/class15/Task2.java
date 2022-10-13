package class15;



public class Task2 {
/*Create a method that will take a number
and prints whether the number is even or odd.
*/


void printEvenOdd(int num){// there will only be 1 parameter
    if (num%2==0){
        System.out.println(num+" is even");
    }else{
        System.out.println(num+" is odd");
    }

}

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.printEvenOdd(45);
        task2.printEvenOdd(50);
    }


}
