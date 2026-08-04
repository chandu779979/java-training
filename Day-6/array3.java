import java.util.Scanner;
public class array3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int size = sc.nextInt();
        int arr[][][] = new int[size][size][size];
        int no = 1;
        for(int m = 0; m < size; m++){
            System.out.print("matrix : "+m);
            for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[m][i][j] = no++;
                System.out.print(arr[m][i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
}