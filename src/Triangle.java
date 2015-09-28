//Kathryn Nichols

public class Triangle extends GeometricObject 
//This will extend the superclass
{
//This sets the sides of the triangle to 1.0
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
   //These are ways to set the different sides.
    public double setTheSide1() {
        return side1;
    }
    public double setTheSide2() {
        return side2;
    }
    public double setTheSide3() {
        return side3;
    }
    public void setTheSide1(double side1) {
        this.side1 = side1;
    }
    public void setTheSide2(double side2) {
        this.side2 = side2;
    }
    public void setTheSide3(double side3) {
        this.side3 = side2;
    }
    //This is to get the area
    public double getTheArea() {
        return (side1 + side2 + side3) / 2;
    }
    //This is to get the perimeter
    public double getThePerimeter() {
        return side1 + side2 + side3;
    }
    //This will display the information about the triangle.
    public String toString() {
    return " This is Triangle: Side 1 of it is = " + side1 + " Side 2 of it is = " + side2
           + " Side 3 of it is = " + side3 +"The perimeter is"+(side1+side2+side2);
    }
}