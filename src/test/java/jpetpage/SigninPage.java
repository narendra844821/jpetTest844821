package jpetpage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datapack.Excel_Class;

public class SigninPage {
	WebDriver driver;
	Excel_Class data;
	@FindBy(name = "username")//path for username
	WebElement username;
	@FindBy(name = "password")//path for password
	WebElement password;
	@FindBy(name = "signon")//path for signon
	WebElement login;
	@FindBy(linkText ="Register Now!")//path for register
	WebElement register;

	public SigninPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void send_User1() throws IOException {
		username.clear();//clear the userid box 
		password.clear();//clear the password box

		data = new Excel_Class();

		username.sendKeys(data.excel_username(1));//taking username1 from excel sheet
		password.sendKeys(data.excel_password(1));//taking password1 from excel sheet
	}

	public void send_User2() throws IOException {
		username.clear();
		password.clear();
		data = new Excel_Class();
		username.sendKeys(data.excel_username(2));//taking username2 from excel sheet
		password.sendKeys(data.excel_password(2));//taking password2 from excel sheet
	}

	public void send_User3() throws IOException {
		username.clear();
		password.clear();
		data = new Excel_Class();
		username.sendKeys(data.excel_username(3));//taking username3 from excel sheet
		password.sendKeys(data.excel_password(3));//taking password3 from excel sheet
	}

	public void click_register() {
		register.click();
	}

	public void click_login() {
		// TODO Auto-generated method stub
		login.click();

	}

}
