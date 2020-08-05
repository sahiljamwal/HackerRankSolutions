import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if((int)A.charAt(0)>(int)B.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");

        String temp=A.substring(1);
        String temp1="";
        temp1+=A.charAt(0);
        temp1=temp1.toUpperCase();
        temp1+=temp;
        A=temp1;

        temp=B.substring(1);
        temp1="";
        temp1+=B.charAt(0);
        temp1=temp1.toUpperCase();
        temp1+=temp;
        B=temp1;
            
        System.out.println(A+" "+B);
        
    }
}
