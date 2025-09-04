package e2enetworks.e2enetworks.sel.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.findElement(By.id("name")).sendKeys("Rachit");
		driver.findElement(By.id("email")).sendKeys("rachit1090@gmail.com");
		driver.findElement(By.id("gender")).click();
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
		driver.findElement(By.id("dob")).sendKeys("18-10-1990");
		

	}

}
