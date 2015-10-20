package helloWorld;

interface hello{
	
	// all methods will be abstract.
	void display();
}
public class HelloWorldInterface implements hello{
	
	public void display(){
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		HelloWorldInterface inter =new HelloWorldInterface();
		inter.display();
	}
}
