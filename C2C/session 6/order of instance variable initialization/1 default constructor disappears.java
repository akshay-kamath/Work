
//output :B
//since the default constructor disappears bcoz of A(int a)
class A {
     A(int a){
    System.out.println("A");
     }

}
class B {
     B(){
    System.out.println("B");
     }

}
class Main{
	public static void main(String args[]){

                  B b=new B();

	}

}