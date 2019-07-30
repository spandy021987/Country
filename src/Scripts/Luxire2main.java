package Scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import POM.Luxire1;
import POM.Luxire2;
import generics.Generic_Class;

public class Luxire2main  extends Generic_Class{
	
	@Test
	public void testLuxire2() throws AWTException
	{
		
		Luxire2 l2=new Luxire2(driver);
		
		
		l2.mouseoveraction();
		l2.rightclick();
		l2.newtab();
}}
