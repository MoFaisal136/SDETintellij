package class14;

public class MethodsDemo1 {

    /*
    A method that does not take any parameters and prints some lines on console
     */
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hellooooo nurse");
    }

/*
A method that takes a single parameter of type String and prints it
 */
    void printWord(String word){    //dynamic methods with parameters
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj = new MethodsDemo1();
        obj.printHello();
        obj.printWord("Don't worry it's Java");// will be stored in line 14
        obj.printWord("It don't make no darn sense");
    }
}
