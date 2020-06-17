import java.util.Scanner;

public class Java_string_reverse {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder input = new StringBuilder();
        input.append(A);
        input = input.reverse();
        String s = input.toString();
        if(s.equals(A)) System.out.println("Yes");
        else System.out.println("No");
    }
}