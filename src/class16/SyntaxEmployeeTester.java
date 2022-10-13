package class16;

import class14.Task1;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee asgharEmp = new SyntaxEmployee(); //shift+F6 changes everything
        asgharEmp.empID="123";
        asgharEmp.salary=100000;


        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee mozzamEmp = new SyntaxEmployee();
        mozzamEmp.empID="123";
        mozzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);

    }
}
