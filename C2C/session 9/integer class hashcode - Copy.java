class Main{
  public static void main(String args[]){
  //     Object s1=new Object();
   //   Object s2=new Object();
        Object p=new Employee();
 //   String s1=new String("Hello");
 //   String s2=new String("Hello");
//    String s1="Hello";
//    String s2="Hello";
  //  System.out.println(s1.hashCode());
//    System.out.println(s2.hashCode());
 //   System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
  }
  
}
class Employee  extends Manager{}
class Manager{}

//output:false

//deep vs shallow .equals  in object has shallow comparison whereas other has deep comparison 
//when equals return true hashcode remains same .when equals returns false hashcode may or may not be same.