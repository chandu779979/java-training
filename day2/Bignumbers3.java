package day2;

import java.util.Scanner;

public class Bignumbers3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first  number: ");
        int a = sc.nextInt();
        System.err.println("Enter a second number: ");
        int b = sc.nextInt();
        System.err.println("Enter a third number: ");
        int c = sc.nextInt();
        System.out.println(a>b && a>c? "a is big": b>c? "b is big": "c is big");
    }
}
    

