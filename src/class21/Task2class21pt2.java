package class21;

public class Task2class21pt2{

    public static void main(String[] args){

//2 Obj created
        new Programming();
    }

/*
1. Create a class named "Programming".
2. While creating an object of the class,
if nothing is passed to it,
3. then the message "I love programming languages" should be printed.
4a. If some String is passed to it,
4b. then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.
*/




}
//1
class Programming{

    Programming(){
        System.out.println("I love programming languages"); //3 message inside constructor
    }

    Programming(String str){	//Method Overloading
        System.out.println("I love "+str);		//4b
    }
}

