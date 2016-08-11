import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
	
	@Test //annotations expected, or will not run, run as JUnit test
	public void test1() //JUnit test methods
	{
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("Values are not equal", 10, 20); //deliberate failure
		System.out.println("This is test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test 3");
	}

}
