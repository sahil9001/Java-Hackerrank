import java.io.*;
import java.util.*;
import java.lang.Character;

public class Java_strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        int f = 0;
        for(int i=0;i<Math.min(A.length(),B.length());i++){
            if(A.charAt(i)<B.charAt(i)){
                f = 0;
                break;
            }
            else if(A.charAt(i)>B.charAt(i)){
                f = 1;
                break;
            }
        }
        String a = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b = B.substring(0, 1).toUpperCase() + B.substring(1);        
        if(f==1){
            System.out.println("Yes");
            System.out.println(a + " " + b);
        }
        else{
            System.out.println("No");
            System.out.println(a + " " + b);
        }

    }
}



