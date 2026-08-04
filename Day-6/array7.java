import java.util.Scanner;
public class array7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        char c[] = name.toCharArray();
        for(int i = name.length()-1; i >= 0; i--){
            System.out.print(c[i]);
         }
    }
}