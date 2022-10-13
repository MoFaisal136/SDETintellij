package class20;

import java.sql.SQLOutput;

public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
    it their own features and behaviour. Test all 4 classes
     */

}
/*
1. Privatize the variables would cause class unable to inherit SO
use PROTECTED or DEF
2.create constructor
3. this = use instance var instead of local
4. create first teacher class that EXTENDS from class created
5. Child class should have own constructor to take certain values to pass DOESN'T NEED ALL
6. Child classes must state which parent fields will be used
7. Click on error and create SUPER + constructor
8. Adding new child specific field
 */
class Teacher{
    protected String name;    //1
    protected int age;
    protected int yearsOfExperience;

    Teacher(String name, int age, int yearsOfExperience){   //2

      this.  name= name;        //3
      this.    age=age;
      this.  yearsOfExperience=yearsOfExperience;
    }

    void teach(){
        System.out.println(name+ " is teaching");
    }

}

class MathTeacher extends Teacher{      //4

    void teachTheClass(){
        System.out.println("I'll teach the class even if the world will end");
    }
    MathTeacher(String name, int age, int yearOfExperience){    //5 CHILD CLASS CONSTRUCTOR
        super(name, age, yearOfExperience); //6
    }

}


class ChemistryTeacher extends Teacher{ //7

    boolean teachOrganic;

    ChemistryTeacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }
    void teachChem(){
        System.out.println(name+ " teaching Chemistry");
    }
}


class PianoTeacher extends Teacher{

    String pianoType;           //8
    PianoTeacher(String name, int age, int yearsOfExperience, String pianoType) {
        super(name, age, yearsOfExperience);

        this.pianoType=pianoType;
    }


    public static void main(String[] args) {
        MathTeacher mathTeacher=
                new MathTeacher("Nadia", 26, 2);
        mathTeacher.teach();

        PianoTeacher pt=new PianoTeacher("Ingrid", 21, 0, "Grand");
        pt.teach();

    }
}


