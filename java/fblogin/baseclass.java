package fblogin;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass 
{
	static WebDriver driver;
	
	
	public static WebDriver browserlaunch(String bname) 
	{
		switch(bname)
		{
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "Chromed":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			default:
				System.out.println("Invalid Browser");
				
		}
		return driver;
		
		}
public static void urllaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
		}
public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
}
public static String currenturl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}
public static String gettitle() {
	String title = driver.getTitle();
	return title;
}
public static void quit() {
	driver.quit();
}
public static  String gettext(WebElement e) {
	String text = e.getText();
	return text;
	}
public static void sendkey(WebElement e,String value) {
	e.sendKeys(value);
}
public static void click(WebElement e) {
	e.click();
	
}
public static String getattribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;

}
public static void accept() {
	Alert a=driver.switchTo().alert();
	a.accept();
}
public static void dismiss() {
	Alert a=driver.switchTo().alert();
	a.dismiss();

}
public static String alertsendkey(String txt) {
	Alert a=driver.switchTo().alert();
	String alert = a.getText();
	return alert;
}
public static String alertgettext(WebElement e) {
	Alert a=driver.switchTo().alert();
	String text = a.getText();
	return text;
}
public static void movetoelement(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
}
public static void draganddrop(WebElement src,WebElement des) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, des).perform();;
	}
public static void contextclick(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).perform();
}
public static void doubleclick(WebElement e) {
	Actions a=new Actions(driver);
	a.doubleClick(e).perform();
}
public static void clickandhold(WebElement e) {
	Actions a=new Actions(driver);
	a.clickAndHold(e).perform();
}
public static void release(WebElement e) {
	Actions a=new Actions(driver);
	a.release(e).perform();
}
//public static void keypress(KeyEvent ke,int K) {
//	Robot r=new Robot();
//	r.keyPress(ke.k);
//}
//public static void keyrelease(KeyEvent ke,int k) {
//	Robot r=new Robot();
//	r.keyRelease(ke.k);;
//}
//public static void clear(WebElement e) {
//	e.clear();
//	}
public static void selectbyindex(WebElement e,int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
}
public static void selectbyvalue(WebElement e,String attribute) {
	Select s=new Select(e);
	s.selectByValue(attribute);
}
public static void selectbyvisibletext(WebElement e,String visibletext) {
	Select s=new Select(e);
	s.selectByVisibleText(visibletext);
}
public static List<WebElement> getoption(WebElement e) {
	Select s=new Select(e);
	List<WebElement> options = s.getOptions();
	return options;
}
public static boolean ismulti(WebElement e) {
	Select s=new Select(e);
	boolean multiple = s.isMultiple();
	return multiple;
}
public static List<WebElement> getallselect(WebElement e) {
	Select s=new Select(e);
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	return allSelectedOptions;
}
public static WebElement getfirstselect(WebElement e) {
Select s=new Select(e);
WebElement firstSelectedOption = s.getFirstSelectedOption();
return firstSelectedOption;
}
public static void deslectbyindex(WebElement e,int index) {
	Select s=new Select(e);
	s.deselectByIndex(index);
}
public static void deselectbyvalue(WebElement e,String value) {
	Select s=new Select(e);
	s.deselectByValue(value);
}
public static void deselectbyvisibletext(WebElement e,String visibletext) {
	Select s=new Select(e);
	s.deselectByValue(visibletext);
}
public static void deselectall(WebElement e) {
	Select s=new Select(e);
	s.deselectAll();
}

}

