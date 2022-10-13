package class17;

public class empTester {
    public static void main(String[] args) {
        //Employee() is a constructor created by JVM(Java Virtual Machine)
        Employee emp1=new Employee("Shah", "IT", 122222, 28);

        emp1.printSalary();
        emp1.calculatePrintTax();
    }
}
