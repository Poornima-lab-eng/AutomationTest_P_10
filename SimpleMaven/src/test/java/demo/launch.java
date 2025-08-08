package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {
		System.out.println("fork and pull request");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
