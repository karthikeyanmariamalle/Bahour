package stringTopics;

public class stringTopics {

	// 1.whenever the set of character is defined it will stored, it will be called
	// as String.
	// 2. if you wish to know about the memory location use #
	// system.identityHashcode
	// 3.string can be classified into two types
	// 3a.literal string
	// 3b. non literal string.
	// literal string are stored inside the heap memory and shares the same memory
	// location incase of duplicate
	// and so string is Immutable
	// Non-literal string are stored inside the heap memory and shares the diff
	// memory location incase of duplicate
	// and so non literal string is mutable

	/*
	 * literal string declaration
	 */

	public static void main(String[] args) {

		String firstString = "Literal string";

		String secondString = new String("non Literal string");

		System.out.println(firstString);

		System.out.println(secondString);

		String joinedString = firstString.concat(secondString);
		
		System.out.println(joinedString);

	
		System.out.println(System.identityHashCode(secondString));
		
		
		
		

	}

}
