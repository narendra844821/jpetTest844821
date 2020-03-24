package jpetpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Out_Page {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='Cart']/a")
	WebElement proceed_to_checkout;//xpath for proceed to check out 
	@FindBy(xpath = "//*[@id='Catalog']/form/input")
	WebElement continuee;//xpath for continue
	@FindBy(xpath = "//*[@id='Catalog']/a")
	WebElement conform;//xpath for confirm
	@FindBy(xpath="//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")
	WebElement remove;//xpath for remove

	public Check_Out_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void click_proceed_to_checkout() {
		proceed_to_checkout.click();//click on proced to check out 
	}
	public void click_continuee() {
		continuee.click();// to click on continue
	}
	public void click_conform() {
		conform.click();//to click on confirm
	}
	public void click_remove() {
		remove.click();// to click on remove
	}
}
