import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("righthojeeves.txt"));

		StringBuilder sb = new StringBuilder();
		String s;

		while ((s = br.readLine()) != null) {
			sb.append(s.replace('"', ' ').replace(',', ' '));
		}

		String fullStory = sb.toString();

		String[] words = fullStory.split("\\s+");
         // System.out.println(words.length);
    HashMap<String,ArrayList<String>>hm =new HashMap<>();    
    for(int i=0;i<words.length-3;i++){
       s=words[i]+" "+words[i+1];
       if(hm.containsKey(s)){
            ArrayList<String> h=hm.get(s);
            h.add(words[i+2]);  
       }
       else{
         ArrayList<String>h=new ArrayList<>();
         h.add(words[i+2]);
         hm.put(s,h);
       }
     }  
       Random r=new Random();
       String story="";
       String s1="I";
       String s2="said";
       String s3=s1+" "+s2;
       
       for(int i=1;i<=60;i++){
        ArrayList<String> al=hm.get(s3);
       // System.out.println(al);
       int j=r.nextInt(al.size());
       String next=al.get(j);
       story=story+" "+next;
       }
      // System.out.println(hm.get(s3));
      System.out.println(s3+""+story);
      
      
      
   		 }
  	}
