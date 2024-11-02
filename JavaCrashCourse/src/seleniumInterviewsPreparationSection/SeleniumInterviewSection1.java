package seleniumInterviewsPreparationSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumInterviewSection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty ("webdriver.gecko.driver",
		 * "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe"); WebDriver driver =
		 * new FirefoxDriver();
		 */
		int givenArray[]={10000,12244,13335,15000,9800,12000};
		int temp, size;
		size=givenArray.length;
		
			

			for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
			if(givenArray[i]<givenArray[j])
			{
			temp=givenArray[i];
			givenArray[i]=givenArray[j];
			givenArray[j]=temp;
			}
			}
			}
			System.out.println(givenArray[size-2]);
				
	}

}
