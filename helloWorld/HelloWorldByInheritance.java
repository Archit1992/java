package helloWorld;

class HelloWorld {
	void display() {
		log("Hello World !");
	}
	private static void log(String msg){
		System.out.println(msg);
	}
}

public class HelloWorldByInheritance extends HelloWorld {
	public static void main(String[] args) {
		HelloWorldByInheritance inherit=new HelloWorldByInheritance();
		inherit.display();
	}
}
