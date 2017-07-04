import java.util.*;
class Main{
  public static void main(String args[]){
    
    int i=whatThe();
    System.out.println(i);
    
  }
  public static int whatThe() {
    try {
      System.out.println("hello");
      throw new Exception();
      //  return 2;
    }
    catch(Exception e){
      System.out.println("catch");
      return 3;
    }
    finally {
        return 20;
    }
}
  
}


/*output:
hello
catch
20
*/
