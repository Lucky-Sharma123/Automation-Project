package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs  {

	WebDriver dr;

	public ContactUs(WebDriver dr) {
		this.dr=dr;
	}
	By cllk1=By.xpath("(//a[@id='navbarDropdown'])[2]");
	By cllk2=By.xpath("//a[@class='dropdown-item'and .='Contact Us']");
	By usenm=By.xpath("//input[@name='name']");
	By emai=By.xpath("//input[@name='email']");
	By pho=By.xpath("//input[@name='phone']");
	By txtarea=By.xpath("//textarea[@placeholder='Message']");
	By clik3=By.xpath("//input[@type='submit']");

	public WebElement cilk1() {
		return dr.findElement(cllk1);
	}
	public WebElement cilk2() {
		return dr.findElement(cllk2);
	}
	public WebElement usnme() {
		return dr.findElement(usenm);
	}
	public WebElement email1() {
		return dr.findElement(emai);
	}
	public WebElement pho1() {
		return dr.findElement(pho);
	}
	public WebElement txtra() {
		return dr.findElement(txtarea);
	}
	public WebElement cilk3() {
		return dr.findElement(clik3);
	}
}


