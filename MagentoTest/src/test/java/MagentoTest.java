
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public void first() throws Exception {

		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Main m = new Main(driver);
		m.clickOnMyacc();
		Thread.sleep(3000);

		Login l = new Login(driver);
		l.typeEmail("basha04545@gmail.com");
		l.typePwd("Welcome1234");
		l.clickOnLogin();
		Thread.sleep(3000);

		Logout l1 = new Logout(driver);
		l1.clickOnLogout();

		Thread.sleep(3000);

		driver.quit();
	}
}
