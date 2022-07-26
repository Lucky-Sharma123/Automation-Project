package MobileWorld;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCases {
	//Home page
	@Test(enabled=false)
	public void homePage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();

		HomePage hp=new HomePage(driver);

		String text=hp.getwelcomeTxt();
		System.out.println("Welcome Text:"+text);
		Thread.sleep(1500);
	}

	//SignUp
	@Test(dataProvider="getSignUpData",enabled=false)
	public void main(String fn,String ln,String em,String pwd1,String ph,String bio) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();


		SignUp sp=new SignUp(driver);
		sp.cik1().click();
		Thread.sleep(1500);
		sp.cik2().click();
		Thread.sleep(1500);
		sp.frstnme().sendKeys(fn);
		Thread.sleep(1500);
		sp.lstnme().sendKeys(ln);
		Thread.sleep(1500);
		sp.ema1().sendKeys(em);
		Thread.sleep(1500);
		sp.pwd1().sendKeys(pwd1);
		Thread.sleep(1500);
		sp.rdio1().click();
		Thread.sleep(1500);
		sp.phno1().sendKeys(ph);
		Thread.sleep(1500);
		sp.shbio1().sendKeys(bio);
		Thread.sleep(1500);
		sp.regibtn1().click();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		sp.sigbtn1().click();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
	}

	@DataProvider
	public Object getSignUpData()
	{
		return new Object [][] {{"test","example","test@example.xyz","1234","1234567890","hi i'm",},
			{"","example","test@example.xyz","1234","1234567890","hi i'm",},
			{"test","","test@example.xyz","1234","1234567890","hi i'm",},
			{"test","example","testexample.xyz","1234","1234567890","hi i'm",},};
	}

	//SignIn
	@Test(dataProvider="getSignData",enabled=false)
	public void login(String un,String pwd) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();


		SignIn sg=new SignIn(driver);
		sg.signbtn1().click();
		sg.usrnme().sendKeys(un);
		Thread.sleep(1000);
		sg.pwww().sendKeys(pwd);
		Thread.sleep(1000);
		sg.lgnbtn().click();
		Thread.sleep(1000);
		driver.quit();
	}


	@DataProvider
	public Object getSignData()
	{
		return new Object [][] {{"Test","12324"},
			{"","12324"},
			{"Test",""},
			{"",""},};
	}
	//ContactUs
	@Test(dataProvider="getContactData",enabled=false)
	public void contact(String un,String em,String ph,String txt) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();


		ContactUs or=new ContactUs(driver);
		or.cilk1().click();
		Thread.sleep(1000);
		or.cilk2().click();
		Thread.sleep(1000);
		Set<String> ws=driver.getWindowHandles();
		Iterator<String>it=ws.iterator();
		String parent=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		or.usnme().sendKeys(un);
		or.email1().sendKeys(em);
		or.pho1().sendKeys(ph);
		or.txtra().sendKeys(txt);
		Thread.sleep(1500);
		or.cilk3().click();
	}

	@DataProvider
	public Object getContactData()
	{
		return new Object [][] {{"Test","test@example.xyz","1234567890","zsdxcvh;ihsdxfcgvhbjkn"},
			{"","test@example.xyz","1234567890","zsdxcvh;ihsdxfcgvhbjkn"},
			{"Test","","1234567890","zsdxcvh;ihsdxfcgvhbjkn"},
			{"Test","test@example.xyz","","zsdxcvh;ihsdxfcgvhbjkn"}};
	}

	//All Mobiles Order
	@Test(dataProvider="getOrderData")
	public void mobileorder(String arg1,String arg2,String arg3,String arg4,String arg5,String arg6,String arg7,String arg8,String arg9,String arg10,String arg11) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();


		AllMobilesOrder amo=new AllMobilesOrder(driver);
		amo.cilk1();
		amo.sertxt1(arg1);
		amo.odrclik2();
		amo.frstnme1(arg2);
		amo.lstnme1(arg3);
		amo.email1(arg4);
		amo.pwdd(arg5);
		amo.rdio();
		amo.mnum(arg6);
		amo.addrr1(arg7);
		amo.addrr2(arg8);
		amo.cittyy(arg9);
		amo.statte();
		amo.zip(arg10);
		amo.samsudese();
		amo.apple();
		amo.appleSEEE();
		amo.countno(arg11);
		amo.bdrop();
		amo.boxchk1();
		amo.boxchk2();
		amo.orderbtn();
		Thread.sleep(1500);
		String tuxt=amo.ordertxt();
		System.out.println(tuxt);
		Thread.sleep(1500);
		amo.clossee();
		Thread.sleep(1500);

	}
	@DataProvider
	public Object getOrderData()
	{
		return new Object [][] {{"1","2","3","4","5","6","7","8","9","10","11"},
			{"1","","3","4","5","6","7","8","9","10","11"},
			{"1","2","","4","5","6","7","8","9","10","11"},
			{"1","2","3","4","","6","7","","9","10","11"}};
	}
}

