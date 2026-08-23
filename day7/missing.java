import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int actualsum = 0;
        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
            actualsum = actualsum + arr[i];
        }
            int expectedsum = n * (n + 1) / 2;
            int missing = expectedsum - actualsum;
            System.out.println("Missing value is " + missing);
        }
    }
