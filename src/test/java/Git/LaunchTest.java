package Git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTest {
	
	
	@Test
	public void launchTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Browaer launched");
	}

}
