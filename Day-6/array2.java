import java.util.Scanner;
public class array2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        int no = 1;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = no++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}