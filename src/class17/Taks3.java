package class17;

import java.sql.SQLOutput;

public class Taks3 {
/*
    Create a method that will accept a String as a parameter
    and return a new String that consistently of vowels.
    Method should be available inside the class only(*PRIVATE*) where it was declared
    an executed by calling it is name (*MAKES IT STATIC*).*/

   private static String getVowels(String str){
       String newStr=str.replaceAll("[^aeiouAEIOU]", "");
       return newStr;

    }

    public static void main(String[] args) {
        System.out.println(getVowels("Supercalifragilisticexpialidocious"));
    }

}
