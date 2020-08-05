import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int size=s.nextInt();
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<size;j++)
            {
                temp.add(s.nextInt());
            }
            arr.add(temp);
        }

        int q=s.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();

            ArrayList<Integer> ans=arr.get(x-1);
            if(y<=ans.size())
            {
                if(i==q-1)
                    System.out.print(ans.get(y-1));
                else
                    System.out.println(ans.get(y-1));
            }
            else
            {
                 if(i==q-1)
                    System.out.print("ERROR!");
                 else
                    System.out.println("ERROR!");
            }
        }
    }
}
