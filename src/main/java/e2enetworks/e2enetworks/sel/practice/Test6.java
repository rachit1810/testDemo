package e2enetworks.e2enetworks.sel.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement dest = driver.findElement(By.id("column-b"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).build().perform();
		
	}

}
