package class16;

public class PersonTester {
    public static void main(String[] args) {

        Person person = new Person();
      // System.out.println(person.password);// get error because private to only Person class

        System.out.println(person.salary);
        //MUST BE IN SAME PACKAGE UNLESS Salary is PUBLIC
    }
}
