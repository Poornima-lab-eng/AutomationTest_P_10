package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BalajiTest {
	public class KawasakiTest {
		@Test
		public void lunch() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.kawasaki-india.com/");
			Reporter.log("Kawasaki launched",true);
		}

}
}
