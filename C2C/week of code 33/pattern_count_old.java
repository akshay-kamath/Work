import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Main{

    static int patternCount(String s){
          int c=0,firstInd=0;
        int flag=0;
        String str=null;
       while(firstInd!=-1){
            firstInd=s.indexOf("1");
                str= s.substring (firstInd,s.indexOf('1',firstInd));
          //  System.out.println(str);
                for(int j=1;j<str.length()-1; ){
                    if(s.charAt(j)=='0'){
                        j++;
                    }
                    else
                        flag=1;
                }
                if(flag!=1)
                  c++;
             firstInd=s.indexOf('1',firstInd);
        
        }
                    return c;
    }  
        


    public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int q = Integer.parseInt(br.readLine());
        for(int a0 = 0; a0 < q; a0++){
            String s = br.readLine();
            int result = patternCount(s);
            System.out.println(result);
        }

    }
}
