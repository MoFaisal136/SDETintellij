package class17;

public class Employee {
    //WITH CONSTRUCTORS FIELDS SHOULD BE PRIVATE
    private String name;
    private String department;
    private double salary;
    private  String id;
    private  int age;
    private double actualSalary;//instance field for line17-
    static String companyName="Synatx";


    //** Right click generate CONSTRUCTOR -> SELECT ALL to convert ^^ to constructor


    //Name of constructor should be same as class name/ can choose which fields desired
    Employee(String empName, String empDepart,double empSalary, int empAge){
        name = empName;
        department=empDepart;
        salary=empSalary;
        age=empAge;
    }

    void printSalary(){
        double actualSalary=salary+20000+10000;
        System.out.println(actualSalary);
    }

    void calculatePrintTax(){
        double tax=actualSalary*.3;
        System.out.println("Tax "+tax);

    }


}
