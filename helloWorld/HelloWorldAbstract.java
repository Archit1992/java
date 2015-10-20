package helloWorld;

abstract class HelloAbstract{
	
	abstract void display();
	
	void helloWorld(){
		System.out.println("hello");
	}
}
public class HelloWorldAbstract extends HelloAbstract{
	
	void display(){
		log("hello World !");
	}
	
	public static void main(String[] args) {
		HelloWorldAbstract abstractExample=new HelloWorldAbstract();
		abstractExample.display();
	}
	
	private static void log(String msg){
		System.out.println(msg);
	}
}
