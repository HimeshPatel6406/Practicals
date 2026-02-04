import java.util.*;
public class MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Meters:");
        double m = sc.nextDouble();
        double f = m * 3.2807;
        System.out.println("Your Feet Conversion is:"+f);
    }
}
