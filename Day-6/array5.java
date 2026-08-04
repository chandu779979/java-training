import java.util.Scanner;
public class array5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int size = sc.nextInt();
        int n = 1;
        int a[][][] = new int[size][size][size];
        int b[][][] = new int[size][size][size];
        int c[][][] = new int[size][size][size];
        for(int m = 0; m < size; m++){
            System.out.print("matrix : "+m);
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    a[m][i][j] = n ;
                    b[m][i][j] = a[m][i][j] + a[m][i][j];
                    c[m][i][j] = b[m][i][j] + b[m][i][j];
                    n = n + 10;
                    System.out.print(c[m][i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}