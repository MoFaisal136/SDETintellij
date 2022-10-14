package review3;

public class Teacher {

    String name, lname;
    String subj;
    int experience;
    double salary;

    static String school;

    //this. -> used to refer to the current object: instance variables
                        //instance methods
    Teacher (String name, String lname){
        this. name=name;
        this.lname=lname;
    }
//this() -> refers to the current object : current class constructor
    Teacher(String name, String lname, String subject){     //Constructor overloading
        this(name, lname);  //Constructor call must be the first statement in a
        this.subj=subj;
    }

    Teacher(String name, String lname, int experience){
        this (name, lname);
        this.experience=experience;
    }
    static void work(){     //static
        System.out.println("All teachers work at"+ school);

    }
    void print(){       //instance
        System.out.println("Teacher name is "+name+" "+lname);
    }

    void teach(){       //instance
        print();    // calling print method from above
        System.out.println(name+ " teaches "+ subj);
    }

    //method that will calculate bonus based on experience and returns it

    double getBonus(){
        if (experience<5){
            return 3;
        }else {
            return 3.5;
        }
    }
}
