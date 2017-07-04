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
     System.out.println(x);
   }
  
  
}
class B extends A{
	
     B(){
    System.out.println("B");
     }

}
class Main{
	public static void main(String args[]){

                  B b=new B();

	}

}

/*
 
 Output:-
 
20
A empty
B
 
 */
