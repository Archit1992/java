package helloWorld;

public class HelloWorldByMethodOverload {
	void display(String msg){
		log(msg);
		
	}
	void display(String msg1, String msg2){
		log(msg1+msg2);
	}
	public static void main(String[] args) {
		HelloWorldByMethodOverload overload= new HelloWorldByMethodOverload();
		overload.display("Hello World1!");
		overload.display("Hello", " World2!");
	}
	private static void log(String msg){
		System.out.println(msg);
	}
	
}
