import java.util.*;
import java.io.*;
class Mime2{
	public static void main(String args[])throws IOException{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,String> hm = new HashMap<>();
		String s[] = br.readLine().split(" "); 
		int n = Integer.parseInt(s[0]);
		int q = Integer.parseInt(s[1]);
		
		for(int i = 0; i < n; i++){
			String s1[] = br.readLine().split(" ");
			hm.put(s1[0], s1[1]);
		}
		for(int j =0; j < q; j++){
			String ip = br.readLine();
			int ind = ip.lastIndexOf('.');
			String n1 = "";
			if(ind == -1){
				n1 = "";
			}
			else{
				n1 = ip.substring(ind+1);
			}
			
			if(hm.get(n1) == null){
				System.out.println("unknown");
			}
			else{
				System.out.println(hm.get(n1));
			}
		}
	}
}