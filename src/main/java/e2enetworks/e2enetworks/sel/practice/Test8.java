package e2enetworks.e2enetworks.sel.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//a[text()='Slow Resources']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.findElement(By.xpath("//a[text()='Slow Resources']")).click();
		
	}

}
