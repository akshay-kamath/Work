import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int i,result=0,a;
        int n=read.nextInt();
        for(i=0;i<n;i++){
            a=read.nextInt();
            result+=a;
        } 
        System.out.print(result);
        }
    }
