/*Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787),
calculate and display the minimum number of currency notes of denominations 100, 50, 10,
5, 2, and 1 that would be given to the user.*/
import java.util.*;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount to dispense: ");

        if (input.hasNextInt()) {
            int amount = input.nextInt();

            if (amount < 0) {
                System.out.println("Invalid amount. Please enter a positive number.");
            } else {
                calculateNotes(amount);
            }
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        input.close();
    }

    public static void calculateNotes(int amount) {
        int[] denominations = {100, 50, 10, 5, 2, 1};
        System.out.println("Dispensing for: " + amount);

        for (int note : denominations) {
            int count = amount / note;
            if (count > 0) {
                System.out.println(note + " x " + count);
            }
            amount %= note;
        }
    }
}