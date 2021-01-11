package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedCases {
	@Test
	public void cFirst() {		
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void bSecond() {
		Assert.assertEquals(true, false);
	}
}
