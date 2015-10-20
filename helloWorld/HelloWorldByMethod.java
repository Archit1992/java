package helloWorld;

public class HelloWorldByMethod {
	public static void display(){
		log("Hello World !");
	}
	public static void main(String[] args) {
		
		// simple method invoke.
		HelloWorldByMethod.display();  
	}
	private static void log(String msg){
		System.out.println(msg);
	}
}
