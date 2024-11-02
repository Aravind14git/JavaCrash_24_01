package seleniumInterviewsPreparationSection;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAugust_p24 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");

		/*screenshot_Scenario:
		 * TakesScreenshot screenshot = (TakesScreenshot) driver; File sourceFile=
		 * screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
		 * File("D://sample.png"); org.openqa.selenium.io.FileHandler.copy(sourceFile,
		 * destinationFile);
		 * 
		 * 
		 * Robot robot = new Robot(); Dimension screensize=
		 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle rectangle = new
		 * Rectangle(screensize); BufferedImage sourceFile=
		 * robot.createScreenCapture(rectangle); File destinationFile = new
		 * File("D://sample.png"); ImageIO.write(sourceFile, "png", destinationFile);
		 */

		/*
		 * //Refresh: driver.get(driver.getCurrentUrl()); JavascriptExecutor js =
		 * (JavascriptExecutor)driver;
		 * js.executeScript("location.reload()");//"history.go(0)
		 */	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 450)", "");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0, -450)", "");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
//Specific position
		js.executeScript("arguments[0].scrollIntoView(true):", link);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		 // Give the xpath of the element to which you have to scroll

        WebElement scroll_right = driver.findElement(By.xpath(""));
        WebElement scroll_left = driver.findElement(By.xpath(""));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        
        // Scroll Right
        jse.executeScript("argument[0].scrollIntoView()", scroll_right);
        
        // Scroll Left
        jse.executeScript("argument[0].scrollIntoView()", scroll_left);
		




	}

}
