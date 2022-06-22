package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Both {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	FirefoxDriver d=new FirefoxDriver();
}
}
