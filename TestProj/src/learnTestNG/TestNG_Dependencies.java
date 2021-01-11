package learnTestNG;

import org.testng.annotations.Test;

public class TestNG_Dependencies {
	@Test
	public void cFirst() {		
		
		
			System.out.println("1st TestCase");
		
	}
	
	@Test(dependsOnMethods="cFirst")
	public void bSecond() {
		
		
			System.out.println("2st TestCase");
		
	}
	
	@Test(dependsOnMethods="bSecond")
	public void aThird() {
	
			System.out.println("3rd TestCase");
		
		
	}
}
