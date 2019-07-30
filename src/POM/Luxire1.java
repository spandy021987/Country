package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Basic_Page;

public class Luxire1  extends Basic_Page{

	public Luxire1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[.='Gift Cards']")
	private WebElement button1;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement button2;
	@FindBy(xpath="(//button[@type='submit'])[4]")
	private WebElement button3;
	
	public void  click1()
	{
		button1.click();
		
	}
	public void  click2()
	{
		button2.click();
		
	}
	public void  click3()
	{
		button3.click();
		
	}

}
