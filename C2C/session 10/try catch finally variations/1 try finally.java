import java.util.*;
class Main{
  public static void main(String args[]){
    
    int i=whatThe();
    System.out.println(i);
    
  }
  public static int whatThe() {
    try {
        return 10;
    }
    finally {
        return 20;
    }
}
  
}


//output:returns 20