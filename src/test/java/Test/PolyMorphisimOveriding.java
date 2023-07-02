package Test;

public class PolyMorphisimOveriding extends PolyMorphisim{

	public void karthi(String rock)
	{
		System.out.println("my name is " +rock);
		
	}
	public static void main(String[] args) {
		
		PolyMorphisimOveriding over = new PolyMorphisimOveriding();
		
		over.karthi("black rock");

	}

}
