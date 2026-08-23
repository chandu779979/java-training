import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
                System.out.println("sorrted array");
            }
            else{
                System.err.println("Not sorrted array");
            }
            sc.close();
    }
}
