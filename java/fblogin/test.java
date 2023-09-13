package fblogin;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

//import org.lang.IllegalStateException:
import io.github.bonigarcia.wdm.WebDriverManager;
public class test extends baseclass{
	public test() {
	PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement btn;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getbtn() {
		return btn;
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement create;
	public WebElement getCreate() {
		return create;
	}
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	
	@FindBy(name="birthday_day")
	private WebElement day;
		
	@FindBy(id="month")
	private WebElement month;
		
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement custom;
	
	@FindBy(name="websubmit")
	private WebElement sumbmit;

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFemale() {
		return female;
		
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getCustom() {
		return custom;
	}

	public WebElement getSumbmit() {
		return sumbmit;
	}
	
	
	}
	

