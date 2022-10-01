package class13;

public class StringMethod1 {
    public static void main(String[] args) {

        String textFromApp=" Enroll today ";
        String textFromUserStory = "Enroll today";

        if(textFromApp.trim().equals(textFromUserStory)){
            System.out.println("Text matches. Test Pass");

        }else{
            System.out.println("NOT MATCHED. Test Fail");

        }
        System.out.println(textFromApp.trim());


        //substring
        String str="Hello Class";
        String part2=str.substring(6); //Class
        System.out.println(part2);

        String part1=str.substring(0,5);//Hello
        System.out.println(part1);

        //concat
        String newString=part1.concat("").concat(part2);
        System.out.println(newString);
        System.out.println(part1+part2);

        //some examples

        newString.substring(6).charAt(0);

    }
}
