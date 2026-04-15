interface Classify{
    String getDivision(double average);
}
class Result implements Classify{
    public String getDivision(double average){
        if(average>=60){
            return "First Division";
        }
        else {
            return "No Division";
        }
    }
}
public class MainClassify {
    public static void main(String[] args){
        Result r = new Result();
        double avg = 64.5;
        System.out.println("Average:"+avg);
        System.out.println("Division:"+r.getDivision(avg));
    }
}
