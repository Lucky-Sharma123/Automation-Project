package MobileWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class
public class HomePage {
	WebDriver dr;

	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//h1[.='Welcome To Our Mobile World!']")
	WebElement getclosetxt;


	public String getwelcomeTxt()
	{
		return getclosetxt.getText();	
	}
}
