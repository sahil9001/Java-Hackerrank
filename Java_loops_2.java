import java.util.*;
import java.io.*;

public class Java_loops_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans=0;
            for(int j=0;j<n;j++){
                System.out.print((int)(a+b*(Math.pow(2,j+1)-1))+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
