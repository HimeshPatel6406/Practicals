class Circle {
    double r=1, pi =1;
    Circle(){}
    Circle(double r, double pi){
        this.r = r;this.pi = pi;
    }
    double getArea(){
        return (pi*r*r);
    }
    double getCircumference(){
        return 2*(pi*r);
    }
    public static void main(String[] args){
        Circle cr = new Circle(15,3.14);
        System.out.println("Area of Circle:"+cr.getArea());
        System.out.println("Circumference of Circle:"+cr.getCircumference());
    }
}
