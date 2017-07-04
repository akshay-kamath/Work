import java.util.*;
class Main{
  public static void main(String args[]){
    try{
      System.out.println("Hello");
      throw new Exception();
    }
    catch(Exception re){
      System.out.println("exception");
      
    }
    finally{
      System.out.println("finally");
    }
    
  }
  
  
}


/*
output:
Hello
exception
finally
 */