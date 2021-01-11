package Learn_Selenium;
import org.testng.annotations.*;
public class LearnAnnotation {
@AfterClass
public void AfterClass(){
	System.out.println("After Class");
}
@BeforeClass
public void BeforeClass(){
	System.out.println("Before Class");
}
@AfterSuite
public void AfterSuite(){
	System.out.println("After Suite");
}
@BeforeSuite
public void BeforeSuite(){
	System.out.println("Before Suite");
}
@Test
public void LearnTestNGListener(){

	System.out.println("Test 1");
}
@Test
public void CurrentMethod(){
	System.out.println("Test");
}
@AfterMethod
public void AfterMethod(){
	System.out.println("After Method");
}
@BeforeMethod
public void BeforeMethod(){
	System.out.println("Before Method");
}
@AfterTest
public void AfterTest(){
	try{
		System.out.println("After Test");
	}catch(Exception ex){
		throw ex;
	}
}
@BeforeTest
public void BeforeTest(){		
	try{
		System.out.println("Before Test");
	}catch(Exception ex){
		throw ex;
	}
}
}
