package class21;

public class Task1Class21{
/*
Create 1 class in which create a method that will calculate the area (volume in case of box) of
Rectangle, Square, box
Use Separate class to test your code
*/

    public static void main(String[] args){
        AreaManager areaManager = new AreaManager();
        areaManager.calcArea(10, 12); 	//passing different parameters to calc area
    }
}

class AreaManager{
    //USING METHOD OVERLOADING
    void calcArea(double length, double width){	// area of a rectangle
        System.out.println(length*width);
    }

    void calcArea(double length){
        System.out.println(length*length);	//area of square
    }

    void calcVolume(double length, double height, double width){
        System.out.println(length*width*height);	//volume of box

    }
}

