package review3;

public class School {


        public static void main(String[] args) {
            Teacher t = new Teacher("Shah", "Faisal");
            System.out.println(t.name);

            Teacher t1 = new Teacher("Nadia", "Shaikh", "English");
            t1.teach();

            Teacher t2 = new Teacher("Ingrid", "Escobar", 2);

            Teacher.school="Syntax";    //calls static void work
            Teacher.work();

        }
    }

