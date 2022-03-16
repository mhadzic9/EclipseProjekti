import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MIRZA\\Desktop\\Praksa\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.name("travel_date")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] ")).getText().contains("April") ) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List <WebElement> dates = driver.findElements(By.className("day"));
		for (int i=0;i<dates.size();i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break; 
						
				
			}
		}

	}

}
