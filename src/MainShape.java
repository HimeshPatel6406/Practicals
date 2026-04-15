import java.util.Scanner;
class Shape {
    double d1, d2;

    void getData(double d1,double d2){
        this.d1 = d1;
        this.d2 = d2;
    }
}
class Triangle extends Shape{
    double calculateArea(){
        return 0.5 * d1 * d2;
    }
}
class Rectangel extends Shape {
    double calculateArea(){
        return  d1 * d2;
    }
}
public class MainShape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        System.out.println("Enter Base And height of Triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t.getData(base,height);

        Rectangel r = new Rectangel();
        System.out.println("Enter Length and breadth of rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        r.getData(length, breadth);

        System.out.println("\nArea of Triangle:"+t.calculateArea());
        System.out.println("\nArea of Rectangle:"+r.calculateArea());
    }
}
