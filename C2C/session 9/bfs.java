import java.util.*;
class Main {
    public static void main(String args[]){
     Scanner read=new Scanner(System.in);
     int n=read.nextInt();
     int m=read.nextInt();
     int a[][]=new int[n][m];
     for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
         a[i][j]=read.nextInt();
       }
     }
      System.out.println("Enter source and destination");
      int n1=read.nextInt();
      int n2=read.nextInt();
      boolean found=false;
      boolean visited[]=new boolean[n];
      Queue<Integer> q=new ArrayDeque<>();
      q.add(n1);
      while(!q.isEmpty()){
        int x=q.poll();
        visited[x]=true;
        if(x==n2){
          found=true;
          break;
        }
        for(int i=0;i<n;i++)
          if(a[x][i]==1 && !visited[i]){
            q.add(i);
            visited[i]=true;
          }
      }
      if(found)
      System.out.println("Path found!!!! ");
      else
        System.out.println("Path not found!!!! ");
    }
  
}