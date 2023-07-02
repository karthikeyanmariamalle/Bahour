package stringTopics;

public class LiteralString2 {

	public static void main(String[] args) {
		String s = "Sachin";
        s = s.concat(" Tendulkar");
        System.out.println(s);
        
        /*
         * Here Sachin is not changed but a new object is created with “Sachin Tendulkar”. 
         * That is why a string is known as immutable.
		As you can see in the given figure that two objects are created but s reference variable still refers to “Sachin”
		 and not to “Sachin Tendulkar”. 
		But if we explicitly assign it to the reference variable, it will refer to the “Sachin Tendulkar” object.  
         */
    

	}

}
