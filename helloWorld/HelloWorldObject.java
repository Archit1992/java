package helloWorld;

public class HelloWorldObject {
	public static void displayHello(){
		log("Hello World!");
	}
	private static void log(String msg){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		displayHello();   // direct we can call method of the class.
		
		// secondly, we can create an object of the class.
		HelloWorldObject obj=new HelloWorldObject();
		obj.displayHello();
		
	}
}
