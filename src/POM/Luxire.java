package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Actions1;
import generics.Basic_Page;

public class Luxire extends Basic_Page {

		
		
		public Luxire(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
	
	
	@FindBy(xpath="//a[.='Account']")
	private WebElement button1;
	@FindBy(xpath="//a[.='Login']")
	private WebElement button2;


	@FindBy(xpath="(//input[@ placeholder='Email'])[1]")
	private WebElement tbox1;
	@FindBy(name="customer[password]")
	private WebElement tbox2;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement button3;
	
	public void mouseoveraction()
	{
		Actions1 act=new Actions1(driver);
		act.mouseoveraction(button1);
		
	}

	public void click3()
	{
		button2.click();
	}
	public void  setEmail(String ename) {
		tbox1.sendKeys(ename);
	}
	public void setpassword(String pwd)
	{
		tbox2.sendKeys(pwd);
	}
	public void click4()
	{
		button3.click();
	}
	
	

}

	
	
	
	


