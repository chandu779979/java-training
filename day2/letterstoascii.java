package day2;

import java.util.Scanner;

public class letterstoascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.next().charAt(0);
        if(num >= 65 && num <= 97){
            System.out.println("capatial letters.");
        } else if(num >= 97 && num <= 122){
            System.out.println("small leters.");
        } else if (num >= 48 && num <= 57){
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is not a letter or digit.");
        }
    }
    }
