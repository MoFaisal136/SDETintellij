package class17;

public class Task2 {

    /*
    Create a method that will take a String as a parameter and returns reversed String
     Method should be available to all classes within your project and accessible by class name.
     */

    public static String reverseStr(String str){
      /*  String newStr;
        StringBuilder sb = new StringBuilder(str);// passing through SB(*)
        sb.reverse();
        //CHARACTERS OF STRING REVERSED
        newStr=sb.toString();
        return newStr;*/
return new StringBuilder(str).reverse().toString();// SAME AS but cleaner ^^ called method chaining


    }

    public static void main(String[] args) {
        System.out.println(Task2.reverseStr("Racecar"));
    }
}
