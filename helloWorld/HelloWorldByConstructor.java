package helloWorld;

public class HelloWorldByConstructor {
	public HelloWorldByConstructor() {
		// TODO Auto-generated constructor stub
		log("Hello world !");
	}
	public static void main(String[] args) {
		
		// Constructor invoke.
		new HelloWorldByConstructor();
	}
	private static void log(String msg){
		System.out.println(msg);
	}
}
