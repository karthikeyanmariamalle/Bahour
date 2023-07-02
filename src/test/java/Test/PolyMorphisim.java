package Test;

public class PolyMorphisim {

	
	public void karthi(String name)
	{
		System.out.println("my name is " +name);
		
	}
	
	public void jun2947(String name, float age, int age1) {
		System.out.println("my name is " +name);
		System.out.println("my age is " +age);
		System.out.println("my name is " +age1);
	}
	
	public static void main(String[] args) {
		
		PolyMorphisim poly = new PolyMorphisim();
		
		poly.karthi("Karthik");
		poly.jun2947("sandy", 0.7f, 24);
		
		
	}

}
