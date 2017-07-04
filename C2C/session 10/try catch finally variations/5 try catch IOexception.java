import java.io.*;
class Main{
  public static void main(String args[]){
    try{
      System.out.println("Hello");
    }
    catch(IOException re){
      System.out.println(re);
      
    }
    
    
  }
  
  
}


/*
Main.java:7: error: exception IOException is never thrown in body of corresponding try statement
    catch(IOException re){
    ^
1 error
 */