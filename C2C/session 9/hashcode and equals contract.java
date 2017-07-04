class Main{
  public static void main(String args[]){
//    String s1=new String("Hello");
//    String s2=new String("Hello");
    String s1="Hello";
    String s2="Hello";
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
  }
  
}


//hashcode and equals contract

/*
 Output:(commenting line 5 and 6)
69609650
69609650
false
true 

Output:(commenting line 3 and 4)
69609650
69609650
true
true
 */