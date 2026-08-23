import java.util.Scanner;

public class dup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String  result= " ";
        for(char ch : str.toCharArray()){
            if(result.indexOf(ch) == -1){
                result += ch;
            }
            System.err.println(result);
        }
    }
}
