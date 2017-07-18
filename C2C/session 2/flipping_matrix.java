import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        int q=read.nextInt();
        for(int i=0;i<q;i++)
        {
        int n=read.nextInt();
      int a[][]=new int[2*n][2*n];
        for(int r=0;r<2*n;r++)
            {
            for(int c=0;c<2*n;c++)
                {
                a[r][c]=read.nextInt();
            }
        }
        int total=0;
        int count=0;
        while(count<n)
            {
            int find_max=0;
            for(int k=0;k<n;k++)
                {
                int c=Math.max(a[count][k],a[count][(2*n)-k-1]);
                int d=Math.max(a[(2*n)-count-1][(2*n)-k-1],a[(2*n)-count-1][k]);
                find_max=Math.max(c,d);
                total=total+find_max;
            }
           count++;
        }
        System.out.println(total);
    }
}
    }
