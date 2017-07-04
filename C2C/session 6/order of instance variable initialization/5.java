class A {
     A(int a){
    System.out.println("A");
    }
  
}
class B extends A{
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

/*
 Output:
 A
 B
 */