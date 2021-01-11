package learnTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization {
	@Test
	@Parameters({"Jesus","Christ"})
	public void Vivo1(String Jesus, String Christ ) {						
			System.out.println(Jesus+ "\n"+Christ);		
	}
	
	
}
