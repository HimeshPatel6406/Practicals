import java.util.Scanner;

public class CramersRule {
    public static void main(String[] args){
        double a,b,c,d,e,f,x,y;
        Scanner s=new Scanner(System.in);
        System.out.println("For First Equation:");
        System.out.println("Enter The Value Of A:");
        a = s.nextDouble();
        System.out.println("Enter The Value Of B:");
        b = s.nextDouble();
        System.out.println("Enter The Value Of E:");
        e = s.nextDouble();
        System.out. println("Enter The Second Equation");
        System.out.println("Enter The Value Of D:");
        d = s.nextDouble();
        System.out.println("Enter The Value Of C:");
        c = s.nextDouble();
        System.out.println("Enter The Value Of F:");
        f = s.nextDouble();

        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("Value for X:"+x);
        System.out.println("Value for Y:"+y);
    }
}
