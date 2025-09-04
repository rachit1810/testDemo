package e2enetworks.e2enetworks.sel.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@title=\"New Tab\"]")).click();
		for (String handle : driver.getWindowHandles()) {
		    if (!handle.equals(mainWindow)) 
		    {
		        driver.switchTo().window(mainWindow);
		        break;
		    }
		    
		}
		
		
		
	}

}
