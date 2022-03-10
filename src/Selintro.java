import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintro {
	public static void main(String args[])
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\tools\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.com");
	}
}
/*
public static void getWalletBalance(WebDriver driver) {
	String walletText = driver.findElement(By.xpath("//div[contains(@class,'user_wallet')]/div/div/div[2]/h4")).getText();		
	String walletCurrency = walletText.split(" ")[0];
	String walletAmount = walletText.split(" ")[1];
	System.out.println("Wallet Currency: " + walletCurrency);
	System.out.println("Wallet Amount: " + walletAmount);
	Assert.assertEquals(walletAmount, "1500");
	Assert.assertEquals(walletCurrency, "USD");
}
public static void testWalletBalanceByCssSelector(WebDriver driver) {
	//
	String walletText = driver.findElement(By.cssSelector("div[class*='user_wallet'] div div div h4")).getText();		
	String walletCurrency = walletText.split(" ")[0];
	String walletAmount = walletText.split(" ")[1];
	System.out.println("Wallet Currency CSS: " + walletCurrency);
	System.out.println("Wallet Amount CSS: " + walletAmount);
	Assert.assertEquals(walletAmount, "1500");
	Assert.assertEquals(walletCurrency, "USD");
}

public static void testAtleast500TotalBookings(WebDriver driver) {
	String totalBookings = driver.findElement(By.xpath("//div[contains(@class,'user_wallet')]/following-sibling::div[1]/div/div/div[2]/h4")).getText();
	System.out.println(totalBookings);
	Assert.assertTrue(Integer.parseInt(totalBookings) > 500, "Total bookings Less than 500");
}

*/
