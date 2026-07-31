package day2;

import java.util.Scanner;

public class Bignumbers2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first  number: ");
        int a = sc.nextInt();
        System.err.println("Enter a second number: ");
        int b = sc.nextInt();
        System.out.println(a>b? "a is big": "b is big");
    }
    
}
