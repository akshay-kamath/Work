class A {
     A(int a){
    System.out.println("A");
     }
  A(){
   System.out.println("A-empty");
  }
}
class B {
     B(){
    super(10);
    System.out.println("B");
     }

}
class Main{
	public static void main(String args[]){

                  B b=new B();

	}

}