package e2enetworks.e2enetworks.sel.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frame1);
		WebElement menu = driver.findElement(By.id("selectnav1"));
		Select sel =new Select(menu);
		sel.selectByContainsVisibleText("Tutorials");
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
		//driver.findElement(By.xpath("(//a[contains(text(),'Tutorials')])[4]")).click();
		//driver.close();
		
	}

}
