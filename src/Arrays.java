public class Arrays {
	public static void main(String args[]) {
		String nam = new String("I'm Iosu Lekubide");
		String bir = new String("28/12/1995");
		
		// The method toCharArray() returns an Array of chars after converting a String into sequence of characters.
		char[] array1 = nam.toCharArray();
		System.out.print("Hello, who are you? ");
	    for(char c: array1){
	    	System.out.print(c);
	    }
	    
	    System.out.println(" ");
	    
	    // The method split() is used for splitting a String into its substrings based on the given delimiter/regular expression.
	    System.out.println("Your birthday splited in day, month & year:");
	    String array2[] = bir.split("/");
	    for (String s: array2){
	    	System.out.println(s);
	    }
	}
}