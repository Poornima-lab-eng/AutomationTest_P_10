package pallavi;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

import objectrepository.HomePage;

public class TC_09 {
	
	
	public void clickOnBooks() {
		HomePage hp=new HomePage(driver);
		hp.getBooks().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books", "Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
}
}
