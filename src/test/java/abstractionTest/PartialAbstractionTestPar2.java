package abstractionTest;

public class PartialAbstractionTestPar2 extends  abstractionTestPar1{
	
	
	@Override
	public void TestMethod1() {
		System.out.println("my name is Karthikeyan ");
		
	}

	@Override
	public void TestMethod2() {
	System.out.println("my name is Sandhiya");
		
	}

	public static void main(String[] args) {
		
		PartialAbstractionTestPar2 partialAbstraction = new PartialAbstractionTestPar2();
		
		partialAbstraction.TestMethod1();
		partialAbstraction.TestMethod2();
	}

	
	

}
