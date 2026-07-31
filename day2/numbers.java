package day2;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = SC.nextInt();
        if(num >= 0 && num < 10) {
            System.out.println("The number is a single-digit number.");
        } else if(num >= 10 && num < 100) {
            System.out.println("The number is a two-digit number.");git status
        } else if(num >= 100 && num < 1000) {
            System.out.println("The number is a three-digit number.");
        } else {
            System.out.println("The number has more than three digits.");
        }
    }
}
    
