package e2enetworks.e2enetworks.sel.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Test9 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> amounts = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"));
		
		int total=0;
		for(WebElement amount: amounts)
		{
			String text = amount.getText().trim();
			if (!text.isEmpty()) 
			{ // avoid empty cells
                int value = Integer.parseInt(text); // convert String -> int
                total = total + value; // add to total
                
            }
			
		}
		System.out.println(total);
	}

}
