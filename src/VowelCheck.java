import java.util.*;
public class VowelCheck {
    public static void main(String[] args){
        System.out.println("Enter Any Word:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        if("aeiou".indexOf(ch)>=0)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
