package jpetpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//div[@id='MenuContent']/a[2]")//xpath for signin
	WebElement signin;
	@FindBy(xpath = "//img[@name='img_cart']")//xpath for cart icon
	WebElement cart_icon;
	@FindBy(name = "keyword")// search box path
 	WebElement search_keys;
	@FindBy(name = "searchProducts")//search button box
	WebElement search_button;
	@FindBy(xpath = "//div[@id='QuickLinks']/a[2]/img")//xpath for dogs
	WebElement dogs;
	@FindBy(xpath = "//*[@id='QuickLinks']/a[4]/img")//xpath for cats
	WebElement cats;
	@FindBy(xpath = "//a[text()='Sign Out']")//xpath for logout
	WebElement logout;
	@FindBy(xpath = "//*[@id='LogoContent']/a/img")//xpath for logo
	WebElement logo;
	@FindBy(xpath = "//*[@id='MainImageContent']/map/area[1]")//xpath for birdspic
	WebElement birdspic;
	@FindBy(xpath="//*[@id='SidebarContent']/a[1]/img")//xpath for fish link
	WebElement fishlink;
	@FindBy(xpath="//*[@id='QuickLinks']/a[3]/img")//xpath for reptails
	WebElement reptails;
	@FindBy(xpath="//*[@id='MenuContent']/a[3]")//xpath for helplink
	WebElement helplink;
	@FindBy (xpath="//*[@id='MenuContent']/a[3]")//xpath for myaccaount
	WebElement myaccount;
	@FindBy (xpath="//*[@id='Catalog']/a")//xpath for myorders
	WebElement myorders;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void click_Signin() {

		signin.click();//To click on Signin

	}

	public void click_logout() {

		logout.click();//To click on logout

	}

	public void click_Cart_Icon() {

		cart_icon.click();//To click on cart icon
	}

	public void send_Search_Keys(String values) {
		search_keys.sendKeys(values);//To click on sendkeys

	}

	public void search_button() {
		search_button.click();//To click on Search
	}

	public void click_Dogs() {

		dogs.click();//To click on dogs
	}

	public void click_Cats() {
		cats.click();//To click on cats 
	}

	public void click_Logo() {

		logo.click();//to click on logo
	}
	public void click_bird_pic(){
		birdspic.click();//to click on birds pic 
	}
	public void click_fish_link() {
		fishlink.click();//to click on fish ink
	}
	public void click_reptiles() {
		
		reptails.click();//to click on reptiles
	}
	public void click_help() {
		helplink.click();//to clcik on help link
	}
	
	public void click_myaccount() {
		myaccount.click();//to click myaccount
	}
	
	public void click_myorders() {
		myorders.click();//to click myorders
	}
}
