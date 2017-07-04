class Fibonacci{

    public static void main(String args[]){
         Scanner read=new Scanner(System.in);
         int n=read.nextInt();
     /*  int max=9999;
         for(int i=0;i<n;i++){
          a=read.nextInt();
          if(a>max)
          max=a;
       }*/
         
          int []fibo=new fibo[n+1];
          fibo[0]=0;
         fibo[1]=1;
         for(int j=2;j<n;j++)
            fibo[i]=fibo[i-1]+fibo[i-2];
         
         for(int i=0;i<n;i++)



     }
     public static  int fibo(int n){
           if(n==0||n==1)
          return n;
           else
          return(fibo(n-1)+fibo(n-2));
       }
   

}