interface Exam{
    boolean ispassed(int mark);
}
interface Classy{
    String getDivision(double average);
}
class Res implements Exam, Classy{
    public boolean ispassed(int mark) {
        return mark>=35;
    }
    public String getDivision(double average) {
        if (average >= 60){
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 35) {
            return "Pass Division";
        }else {
            return "Fail";
        }
    }
}

public class MainResult {
    public static void main(String[] args){
        Res a = new Res();
        int mark = 72;
        double average = 65.5;
        System.out.println("Marks:"+mark);
        System.out.println("Result:"+(a.ispassed(mark) ? "Passed" : "Failed"));
        System.out.println("Average:"+average);
        System.out.println("Division:"+a.getDivision(average));
    }
}
