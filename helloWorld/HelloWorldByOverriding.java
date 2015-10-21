package helloWorld;

/* If you are using method overriding then Subclass object will always call
*  to the Subclass methods.
*  
*  If you are using Constructor Overriding then Subclass object will call the 
*  Superclass constructor first, and then Subclass Constructor.
*  
*  If you would like to call Superclass override method from Subclass override
*  method( display() ) then use SUPER as I mentioned below in the comment. 
*/
class Override{
	
	public Override(){
		System.out.println("Hello World by Override Constructor! ");
	}
	
	public void display(){
		System.out.println("Hello World By Parent Class!");
	}
}

public class HelloWorldByOverriding extends Override{
	
	public HelloWorldByOverriding(){
		
		// super.display();        
		System.out.println("Hello World by HelloWorldByOverriding Constructor! ");
	}
	
	public void display(){
		
		System.out.println("Helloe World By Child Class!");
	}
	public static void main(String[] args) {
		
		HelloWorldByOverriding ride=new HelloWorldByOverriding();
		ride.display();
	}
}
