import java.util.*;
class Main{
  public static void main(String args[]){
  
    try {
      System.exit(0);
      //System.exit closes JVM itself.
    }
    catch(Exception e){

    }
    finally {
      System.out.println("finally");
    }
}
  
}