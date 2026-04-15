public class VotingApp {
    static void checkEligibility(int age){
        if(age<18) throw new IllegalArgumentException("Age must be 18 or above");
        System.out.println("Eligible to vote.");
    }
    public static void main(String[] args){
        try{
            checkEligibility(16);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Validation process Completed.");
        }
    }
}
