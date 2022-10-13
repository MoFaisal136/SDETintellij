package class14;

public class MethodsDemo4 {

    boolean mystery(){
        return true;
    }

    String mystery2(int num){
        return "java";
    }

    String method(String word){
        //return "Java";
        if(word.equals("JAVA")){
            return "Python";
        }else{
            return "JAVA";
        }

    }

    public static void main(String[] args) {
        MethodsDemo4 md4=new MethodsDemo4();
        System.out.println(md4.mystery());
        System.out.println(md4.mystery2(10));
        System.out.println(md4.method("Python"));
    }
}
