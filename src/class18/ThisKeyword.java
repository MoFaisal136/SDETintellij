package class18;

public class ThisKeyword {

    String str="Red";

    void print(){
        String str="Blue";

        System.out.println(this.str);// only accesses local
        System.out.println(str);
    }

    public static void main(String[] args) {
        new ThisKeyword().print();
    }
}
