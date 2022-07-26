package MobileWorld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AllMobilesOrder {
	WebDriver dr;

	public AllMobilesOrder(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(xpath="//a[.='All Mobiles']")
	WebElement clkk1;

	@FindBy(xpath="//input[@placeholder='Search your Mobile name here']")
	WebElement sertxt;

	@FindBy(xpath="//a[@class='btn btn-primary  waves-effect waves-light' and .='Order']")
	WebElement ordclk;

	@FindBy(xpath="(//input[@id='inputFirstName'])[1]")
	WebElement frstnme;

	@FindBy(xpath="(//input[@id='inputFirstName'])[2]")
	WebElement lstnnme;

	@FindBy(xpath="//input[@id='inputEmail']")
	WebElement  emmai;

	@FindBy(xpath="//input[@type='password']")
	WebElement paswd;

	@FindBy(xpath="(//label[@class='form-check-label'])[1]")
	WebElement radioo;

	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement mobi;

	@FindBy(xpath="//label[.='Address 1']/following-sibling::input[1]")
	WebElement adr1;

	@FindBy(xpath="//label[.='Address 2']/following-sibling::input[1]")
	WebElement adr2;

	@FindBy(xpath="//label[.='City']/following-sibling::input[1]")
	WebElement ciity;

	@FindBy(xpath="//label[.='State']/following-sibling::select[1]")
	WebElement state;

	@FindBy(xpath="//label[.='Zip']/following-sibling::input[1]")
	WebElement zipp;

	@FindBy(xpath="//input[@rel='samsung']")
	WebElement samdesel;

	@FindBy(xpath="//input[@rel='apple']")
	WebElement applesel;

	@FindBy(xpath="//option[.='Apple XS ']")
	WebElement appleSE;

	@FindBy(xpath="//input[@placeholder='no of mobiles']")
	WebElement countmob;

	@FindBy(xpath="//select[@id='bought']")
	WebElement boughtdrop;

	@FindBy(xpath="(//input[@id='gridCheck1'])[1]")
	WebElement chkbox1;

	@FindBy(xpath="(//input[@id=\"gridCheck1\"])[2]")
	WebElement chkbox2;

	@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
	WebElement orderbtn;

	@FindBy(xpath="//div[@class='modal-body']")
	WebElement getclosetxt;

	@FindBy(xpath="//a[.='Close']")
	WebElement closewin;


	public void cilk1() {
		clkk1.click();
	}
	public void sertxt1(String txt) {
		sertxt.sendKeys(txt);           
	}
	public void odrclik2() {
		ordclk.click(); 
		Set<String> window = dr.getWindowHandles();	
		Iterator<String> it1 = window.iterator();
		String parentId = it1.next();
		String childId = it1.next();
		dr.switchTo().window(childId);

	}
	public void frstnme1(String txt1) {
		frstnme.sendKeys(txt1);          
	}
	public void lstnme1(String txt2) {
		lstnnme.sendKeys(txt2);          
	}
	public void email1(String txt3) {
		emmai.sendKeys(txt3);          
	}
	public void pwdd(String txt4) {
		paswd.sendKeys(txt4);          
	}
	public void rdio() {
		radioo.click();          
	}
	public void mnum(String txt5) {
		mobi.sendKeys(txt5);         
	}
	public void addrr1(String txt6) {
		adr1.sendKeys(txt6);         
	}
	public void addrr2(String txt7) {
		adr2.sendKeys(txt7);         
	}
	public void cittyy(String txt8) {
		ciity.sendKeys(txt8);         
	}
	public void statte() {
		state.click();
		Select sc=new Select(state);
		sc.selectByIndex(2);
	}
	public void zip(String txt9) {
		zipp.sendKeys(txt9);         
	}
	public void samsudese() {
		samdesel.click();         
	}
	public void apple() {
		applesel.click();         
	}
	public void appleSEEE() {
		appleSE.click();         
	}
	public void countno(String no) {
		countmob.sendKeys(no);         
	}
	public void bdrop() {
		boughtdrop.click();
		Select sc=new Select(boughtdrop);
		sc.selectByIndex(1);
	}
	public void boxchk1() {
		chkbox1.click();
	}
	public void boxchk2() {
		chkbox2.click();
	}
	public void orderbtn() {
		orderbtn.click();
	}
	public String ordertxt() {
		return getclosetxt.getText();
	}
	public void clossee() {
		closewin.click();
	}










}
