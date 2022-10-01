package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        //Mostly used, better, faster
        StringBuilder stringBuilder= new StringBuilder("Today is java class");

        //older not mostly used
        StringBuffer stringBuffer = new StringBuffer("Today is java class");

        //converting string to stringbuilder
        String str="Java is very easy";
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1= "+stringBuilder1);


        //StringBuilder to String
        String newStr=stringBuilder1.toString();

    }

}
