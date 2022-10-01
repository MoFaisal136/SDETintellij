package class13;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String str="hello";

        // toUpperCase or toLowerCase

        str= str.toLowerCase();
        System.out.println(str);//hello

        System.out.println("________");

        str=str.toUpperCase();
        System.out.println(str);//HELLO

        //length() -> gives size
        int size = str.length();
        System.out.println(size);

        //charAt() -> Returns char value at the specified index

        char letter =str.charAt(0);
        System.out.println(letter);//H


        //how to get last character
       char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);//0

        /*
        *indexOf-> Returns the index within this string of the first occurrence of the
        * specified character, starting the search at the specified index.
         */
        int index =str.indexOf(lastCharacter);
        System.out.println(index);//4

        System.out.println(str.indexOf('a'));//if it does not find a character it returns (-1)

        //isEmpty() -> returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);

        //trim



    }
}
