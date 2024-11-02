package seleniumInterviewsPreparationSection;

import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class TestNGInterviewPractice1 {
	//sc1: This is about timeOut - here we mention time out method to fail the case 
	//sc 2: Handle the exceptions of timeout  - here we mention expected exceptions to handle it
	@Test(timeOut=2000, expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
	System.out.println("Duckling");

	}
}
