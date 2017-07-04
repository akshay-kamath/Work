class A {
   int x; 
    A(){
     System.out.println("A empty");
    }


     A(int a){
    System.out.println(a);
     }

   {
      x=20;
     System.out.println("A-i");
   }
  
  
}
class B extends A{
     B(){
    super(10);
    System.out.println("B");
     }
   {

  System.out.println("B-i");
   }

}
class Main{
	public static void main(String args[]){

                  B b=new B();

	}

}
/*
Output:
A-i
10
B-i
B


instantiation block is thrown in every constructor after super 
*/