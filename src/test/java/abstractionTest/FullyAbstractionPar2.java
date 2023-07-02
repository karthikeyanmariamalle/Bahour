package abstractionTest;

public class FullyAbstractionPar2 implements fullyAbstractionPar1, FullyAbstractionPar3 {
	
	
	@Override
	public void parMethodForAbstraction1() {
		
		System.out.println("hi, my name is Priya");
		
	}

	@Override
	public void parMethodForAbstractio2() {
		System.out.println("hi, my name is Jeevika");
		
	}
	

	@Override
	public void parMethodForAbstraction3() {

		System.out.println("hi, my name is Jeevika");}

	@Override
	public void parMethodForAbstractio4() {
		System.out.println("hi, my name is Priya");
		
	}

	public static void main(String[] args) {
		FullyAbstractionPar2 FullyAbstractionPar2 = new FullyAbstractionPar2();
		
		FullyAbstractionPar2.parMethodForAbstractio2();
		FullyAbstractionPar2.parMethodForAbstraction1();
		FullyAbstractionPar2.parMethodForAbstraction3();
		FullyAbstractionPar2.parMethodForAbstractio4();
		

	}

	
	

	
	
}
