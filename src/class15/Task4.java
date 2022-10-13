package class15;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 =new Task4();
        task4.sayHello("USA");
    }
    /*Create a method that will say Hello in
    different language based on the country
    that will passed when method is executed.
     */

    void sayHello(String country) {
        // switch (country){   //easier than if else statement
        //alt enter can switch to IF ELSE + ALT ENTER

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;

            default:
                System.out.println("Country not supported");
        }


    }
}