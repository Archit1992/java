public class C extends B{
	
	public static void main(String args[]) {
		new C();
	}
	public C(){
		System.out.println("(4)Invoke class C -> No Argument Constructor. ");
	}
}
class B extends A{
	
	public B(){
		this("(2)Invoke class B -> Argument Constructor. ");
		System.out.println("(3)Invoke class B -> No Argument Constructor. ");
	}
	public B(String s){
		System.out.println(s);
	}
}
class A{
	public A(){
		System.out.println("(1)Invoke class A -> No Argument Constructor. ");
	}
}