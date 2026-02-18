class Rectangle {
    double w=1,h=1;
    Rectangle(){}
    Rectangle(double w,double h){
        this.w=w;this.h=h;
    }
    double getArea(){
        return w*h;
    }
    double getPerimeter(){
        return 2*(w+h);
    }
    public static void main(String[] args){
        Rectangle r= new Rectangle(4,5);
        System.out.println("Area:"+r.getArea());
        System.out.println("Perimeter:"+r.getPerimeter());
    }
}
