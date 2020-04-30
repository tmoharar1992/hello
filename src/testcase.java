import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testcase {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRISHITA MOHARAR\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		String[] arr = {"Cucumber","Tomato","Mushroom","Apple"};
		
		for(int i = 0;i<=arr.length;i++)
		{
			driver.findElement(By.xpath("//div[@class='product']/h4[contains(text(),'"+ arr[i]+"')]/following-sibling::div[2]/button")).click();
		//	Thread.sleep(4000);
			}
		
		
		
		//driver.findElement(By.xpath("//div[@class='product']/h4[contains(text(),'"+"')]/following-sibling::div[2]/button")).click();


		}
		
		
		
	}


