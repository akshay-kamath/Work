import java.io.*;
class Main{
  public static void main(String args[]){
    try{
      System.out.println("Hello");
    }
    catch(NullPointerException re){
      System.out.println(re);
      
    }
    catch(IndexOutOfBoundsException re){
      System.out.println(re);
      
    }
    
  }
  
  
}


/*
output:
Hello
 */