

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
    System.out.println("B");
     }

}
class Main{
	public static void main(String args[]){

                  B b=new B();

	}

}
/*

Output:B
Since default constructor is diappearing bcoz of our defined parameterized constructor so even if the default constructor is written in class A along with the
parameterized constructor then the A-empty wud not appear since parameterized constructor will destroy the default constructor

*/