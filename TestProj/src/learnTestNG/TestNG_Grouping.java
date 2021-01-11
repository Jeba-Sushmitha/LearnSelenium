package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Grouping {
	@Test(groups="Apple")
	public void Apple() {						
			System.out.println("1st Apple");			
			System.out.println("Sushmi");
	}
	@Test(groups="Apple")
	public void Apple1() {						
			System.out.println("2nd Apple");		
	}
	@Test(groups="Vivo")
	public void Vivo() {						
			System.out.println("1st Vivo");		
	}
	@Test(groups="Vivo")
	public void Vivo1() {						
			System.out.println("2st Vivo");		
	}
	@Test(groups="Moto")
	public void Moto() {						
			System.out.println("1st Moto");		
	}
	@Test(groups="Moto")
	public void Moto1() {						
			System.out.println("2st Moto");		
	}
	@Test(groups="Lenovo")
	public void Lenovo() {						
			System.out.println("1st Lenovo");		
	}
	@Test(groups="Lenovo")
	public void Lenovo1() {						
			System.out.println("2st Lenovo");		
	}
}
