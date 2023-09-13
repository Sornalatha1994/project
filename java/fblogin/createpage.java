package fblogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createpage extends baseclass {
	public static void main(String[] args) {
	browserlaunch("firefox");
	urllaunch("https://www.facebook.com/");
	implicitwait(5);
	test t=new test();
	click(t.getCreate());
	sendkey(t.getFname(),"sornalatha");
	sendkey(t.getLname(),"B");
	sendkey(t.getEmail(),"sornalatha1994@gmail.com");
	sendkey(t.getPass(),"sornalatha");
	selectbyvisibletext(t.getDay(),"20");
	selectbyvisibletext(t.getMonth(),"Oct");
	selectbyvisibletext(t.getYear(),"1994");
	click(t.getFemale());
	click(t.getSumbmit());
	}
}