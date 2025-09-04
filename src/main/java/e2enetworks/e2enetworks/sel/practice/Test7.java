package e2enetworks.e2enetworks.sel.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//div[@id=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();
		
	}

}
