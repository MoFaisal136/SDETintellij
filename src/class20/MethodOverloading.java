package class20;

public class MethodOverloading {

     void f1 (String name, int number){
        System.out.println(name+" "+number);
         System.out.println("String, int");
    }

//OVERLOADED METHOD BY CHANGING NUMBER OF PARAMETERS
    // ALLOWS SAME NAME methods
    void f1 (String name, int number, int number2){
        System.out.println(name+" "+number+number2);
        System.out.println("String, num, num2");
    }

    //CHANGED DATA TYPE
    void f1 (int num1, int number){
        System.out.println(num1+" "+number);
        System.out.println("num1, number");
    }


    void f1 ( int number, String name){
        System.out.println(name+" "+number);
        System.out.println("int, String");
    }


    public static void main(String[] args) {
        MethodOverloading md = new MethodOverloading();
        md.f1("Nadia", 26);// USING THE FIRST OVERLOAD STRING+INT
    }

}
