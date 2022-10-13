package class15;

public class Task5 {
    /*
    Create a method createEmail().
    Based on values of users name, first name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    String createEmail(String fname, String lname, String emailType){

        return (fname+lname+"@"+emailType+".com").toLowerCase();

    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        String fullEmail=task5.createEmail("Jon", "Snow", "gmail");
        System.out.println(fullEmail);
    }
}
