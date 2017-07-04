import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Main{

    static int patternCount(String s){
          int c=0,firstInd=0;
        
        String str=null;
        System.out.println("  ");
        firstInd=s.indexOf("1");
       while(firstInd!=-1){
       			int flag=0;
            	int nextInd = s.indexOf("1",firstInd+1);
            	if(nextInd==-1)
            		break;
                str= s.substring (firstInd,nextInd+1);
                System.out.println(str);
                for(int j=1;j<str.length()-1; j++){
                    if(str.charAt(j)!='0'){
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                  c++;
              	System.out.println(c);
             	firstInd=nextInd;
        }
                    return c;
    }  
        


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }
}