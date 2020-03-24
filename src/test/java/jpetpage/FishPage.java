package jpetpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishPage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a") //xpath for angelfish
	WebElement angelfish;
	@FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[4]/td[1]/a")//xpath for koi
	WebElement koi;
	@FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[4]/td[1]/a")//xpath for add to cart koi
	WebElement add_to_cart_koi;
	@FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")//xpath for add to cart angel
	WebElement add_to_cart_angel;
	public FishPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void click_Angel_Fish() {
		angelfish.click();//To click on angelfish
	}

	public void ag_Add_To_Cart() throws InterruptedException {
		Thread.sleep(4000);
		koi.click();//To click on koi
	}
	public void koi_Add_To_Cart() {
		
		add_to_cart_koi.click();//To click on add to cart koi
	}
	public void angelfish_Add_To_Cart() {
		
		add_to_cart_angel.click();//To click on add to cart angelfish
		
	}

}
