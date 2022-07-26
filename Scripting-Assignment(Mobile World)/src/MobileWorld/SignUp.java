package MobileWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	WebDriver dr;

	public SignUp(WebDriver dr) {
		this.dr=dr;
	}

	By clk1=By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']");
	By clk2=By.xpath("//a[@href='signup.html']");
	By fn=By.xpath("//input[@placeholder='First Name']");
	By ln=By.xpath("//input[@placeholder='Last Name']");
	By ema=By.xpath("//input[@placeholder='Enter Email']");
	By pwd=By.xpath("//input[@placeholder='Password']");
	By rdio1=By.xpath("(//input[@type='radio'])[1]");
	//By rdio2=By.xpath("(//input[@type='radio'])[2]");
	By phno=By.xpath("//input[@type='number']");
	By shbio=By.xpath("//textarea[@placeholder='Short Bio']");
	By regibtn=By.xpath("//button[@type='submit' and .='Register']");
	By sigbtn=By.xpath("//button[@type='Submit' and .='Sign In']");

	public WebElement cik1() {
		return dr.findElement(clk1);
	}

	public WebElement cik2() {
		return dr.findElement(clk2);
	}

	public WebElement frstnme() {
		return dr.findElement(fn);
	}
	public WebElement lstnme() {
		return dr.findElement(ln);
	}
	public WebElement ema1() {
		return dr.findElement(ema);
	}
	public WebElement pwd1() {
		return dr.findElement(pwd);
	}
	public WebElement rdio1() {
		return dr.findElement(rdio1);
	}
	//	public WebElement rdio2() {
	//		return dr.findElement(rdio2);
	//	}
	public WebElement phno1() {
		return dr.findElement(phno);
	}
	public WebElement shbio1() {
		return dr.findElement(shbio);
	}
	public WebElement regibtn1() {
		return dr.findElement(regibtn);
	}
	public WebElement sigbtn1() {
		return dr.findElement(sigbtn);
	}









	//		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	//		Thread.sleep(1500);
	//
	//		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("1$");
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("1$");
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc@gmail.com");
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcdef");
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();//male
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();//female
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8987675889");
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("jdsfiuafifiufwefi");
	//		Thread.sleep(1500);

	//		driver.findElement(By.xpath("//button[@type='submit' and .='Register']")).click();
	//		Thread.sleep(1500);

	//	driver.switchTo().alert().accept();
	//	Thread.sleep(1500);
	//
	//		driver.findElement(By.xpath("//button[@type='Submit' and .='Sign In']")).click();
	//		Thread.sleep(1500);
	//
	//	driver.switchTo().alert().accept();
	//	Thread.sleep(1500);






}


