package POM;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Actions1;
import generics.Basic_Page;
import generics.Browser_Actions;

public class Luxire2 extends Basic_Page {
	public Luxire2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[.='Shirts']")
	private WebElement linkbutton1;
	@FindBy(xpath="//a[.='Alumo']")
	private WebElement link1;
	@FindBy(xpath="//a[@href='/products/alumo-cashmerello-offwhite-blue-dark-olive-tatterssall-check-8863_6750_404_al?variant=25006724104']")
	private WebElement img1;
	@FindBy(xpath="(//div[@class='style-select__item-add'])[1]")
	private WebElement button1;
	
	public void mouseoveraction()
	{
		Actions1 act=new Actions1(driver);
		act.mouseoveraction(linkbutton1);
	}
	
	
public void rightclick() {
		
		Actions1 act=new Actions1(driver);
		act.rightclick(link1);
		// TODO Auto-generated method stub
		
	}
	public void newtab() throws AWTException
	{
		Browser_Actions ba=new Browser_Actions();
	
	}
	

}
