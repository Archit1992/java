public class ArrayListTest {
	public static void main(String args[]) {

		java.util.ArrayList<String> stateIndia = new java.util.ArrayList<String>();
		ArrayListTest test = new ArrayListTest();
		test.addStateList(stateIndia);
	}

	public void addStateList(java.util.ArrayList<String> stateIndia) {

		// Add some city into List.
		stateIndia.add("Gujarat");
		// stateIndia List contains ['Gujarat']
		stateIndia.add("Mumbai");
		// stateIndia List contains ['Gujarat', 'Mumbai']
		stateIndia.add("Kerala");
		// stateIndia List contains ['Gujarat','Mumbai','Kerala']
		stateIndia.add("Odisha");
		// stateIndia List conatains ['Gujarat','Mumbai','Kerala','Odisha']

		System.out.println("1) Is Gujarat is a state of India ? \n -> " + stateIndia.contains("Gujarat"));
		System.out.println("2) The location of Mumbai state in India : "+stateIndia.indexOf("Mumbai"));
		System.out.println("3) Is the stateIndia list is empty ? \n -> "+stateIndia.isEmpty());
		
		System.out.println("4) Add new state: Punjab at location 2 : ");
		stateIndia.add(2,"Punjab");
		// Now stateIndia contains ['Gujarat','Mumbai','Punjab','Kerala','Odisha']
		
		//remove state Kerala from stateIndia.
		stateIndia.remove("Kerala");
		
		System.out.println("5) stateIndia List into String Now : "+stateIndia.toString());
		
		// Display the contents of the list(stateIndia) in reverse order...
		
		System.out.println("\n6)Display the content of the list(stateIndia) in reverse order...");
		for(int i=stateIndia.size()-1 ; i>=0;i--){
			System.out.println("Location ["+i+"] ->"+stateIndia.get(i));
		}
	}
}