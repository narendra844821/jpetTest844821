package jpetpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	
	
	@FindBy (name="username") //path for username 
	WebElement userid;
	
	@FindBy (name="password")//path for password
	WebElement newpassword;
	
	@FindBy (name="repeatedPassword")//path for conform password
	WebElement conformpassword;
	
	@FindBy (name="account.firstName")//path for first name
	WebElement fristname;
	
	@FindBy (name="account.lastName")//path for last name
	WebElement lastname;
	
	@FindBy (name="account.email")//path for email
	WebElement email;
	
	@FindBy (name="account.phone")//path for phone number
	WebElement phone;
	
	@FindBy (name="account.address1")//path for address1 
	WebElement address1;
	
	@FindBy (name="account.address2")//path for address2 
	WebElement address2;
	
	@FindBy (name="account.city")//path for city
	WebElement city;
	
	@FindBy (name="account.state")//path for state
	WebElement state;
	
	@FindBy (name="account.zip")//path for zip
	WebElement zip;
	
	@FindBy (name="account.country")//path for country
	WebElement country;
	
	@FindBy (name="account.languagePreference")//path for language prefrence
	WebElement languagePreference;
	
	@FindBy (xpath="//option[@value='english']")//path for selecting english
	WebElement english;
	
	@FindBy (name="account.favouriteCategoryId")//path for favouritecategoryid
	WebElement favouriteCategoryId;
	
	@FindBy (xpath="//option[@value='DOGS']")//path for selectCategory
	WebElement selectCategory;
	
	@FindBy (name="account.listOption")//path for enableMylist
	WebElement enableMyList;
	
	@FindBy (name="account.bannerOption")//path for enableMybanner
	WebElement enableMybanner;
	
	@FindBy (name="newAccount")//path for new account
	WebElement Save_Account_Information;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void registration_Data() throws InterruptedException {
		Thread.sleep(4000);
		userid.sendKeys("adityaadii");
		newpassword.sendKeys("adityajithuu");
		conformpassword.sendKeys("adityajithu");
		fristname.sendKeys("Aditya");
		lastname.sendKeys("Kalapatapu");
		email.sendKeys("lnnaditya@gmail.com");
		phone.sendKeys("07416801468");
		address1.sendKeys("16/21-2,S.N.Puram.");
		address2.sendKeys("Gudivada1");
		city.sendKeys("Gudivada");
		state.sendKeys("AndhraPradesh");
		zip.sendKeys("521301");
		country.sendKeys("India");
		languagePreference.click();
		Thread.sleep(4000);
		english.click();
		Thread.sleep(4000);
		favouriteCategoryId.click();
		Thread.sleep(4000);
		selectCategory.click();
		enableMyList.click();
		enableMybanner.click();
		
		
	}
	public void submitInfo() {
		
		Save_Account_Information.click();
		
	}


	
	
	
}
