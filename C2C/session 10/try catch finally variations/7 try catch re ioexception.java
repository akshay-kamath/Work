import java.io.*;
class Main{
  public static void main(String args[]){
    try{
      System.out.println("Hello");
    }
   catch(RuntimeException re){
      System.out.println(re);
      
    }
    
    catch(IndexOutOfBoundsException re){
      System.out.println(re);
  //unreachable code    
    }
    
  }
  
  
}


/*
Main.java:12: error: exception IndexOutOfBoundsException has already been caught
    catch(IndexOutOfBoundsException re){
    ^
1 error
Runtime exception is parent of IndexOutOFBounds exception

 */