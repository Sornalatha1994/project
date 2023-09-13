package fblogin;

import javax.security.auth.Refreshable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser extends baseclass {
	public static void main(String[] args) {
		browserlaunch("firefox");
		urllaunch("https://www.facebook.com/");
		implicitwait(5);
		test t=new test();
		sendkey(t.getTxtusername(),"sornalatha1994@gmail.com");
		sendkey(t.getPassword(), "sornalatha");
		click(t.getbtn());
		
	}		
	}
	
