package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	WebDriver dr;

	public SignIn(WebDriver dr) {
		this.dr = dr;
	}

	By signbtn = By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']");
	By un = By.xpath("//input[@id='username']");
	By pw=By.xpath("//input[@type='password']");
	By lgnbtn = By.xpath("//a[@class='btn btn-primary btn-block']");


	public WebElement signbtn1() {
		return dr.findElement(signbtn);
	}

	public WebElement usrnme() {
		return dr.findElement(un);
	}

	public WebElement pwww() {

		return dr.findElement(pw);
	}
	public WebElement lgnbtn() {
		return dr.findElement(lgnbtn);
	}



}
