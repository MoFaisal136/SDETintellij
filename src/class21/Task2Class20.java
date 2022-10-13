package class21;

public class Task2Class20{
/* Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
In circle class create a method to calculate the area if circle. Test your code
*/

    public static void main(String[] args){
        Circle circle =new Circle(6);
        circle.calcArea();
    }

}
class Shape{

    double radius; // instance field



    Shape(double radius){ // whenever we take something in a constructor ALWAYS we should also be creating an instance field
        this.radius = radius;
    }
}

class Circle extends Shape{

    Circle(double radius){
        super(radius);
    }

    void calcArea(){
        System.out.println(3.14*radius*radius);		//EITHER WAY WORKS
        System.out.println(Math.PI*Math.pow(radius, 2));	//Math has mulitple mathematic methods

    }
}
