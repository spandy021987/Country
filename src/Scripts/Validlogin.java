package Scripts;

import org.testng.annotations.Test;

import POM.Luxire;
import generics.Excel1;
import generics.Generic_Class;

public class Validlogin {
	public class testValidlogin extends Generic_Class  {
		
		@Test
		public void testValidLogin()
		{
			String ea= Excel1.getcellvalue("Validlogin",1,0);
			String pwd=Excel1.getcellvalue("Validlogin", 1, 1);
			Luxire l=new Luxire(driver);
			
			l.mouseoveraction();
			l.click3();
			l.setpassword(pwd);
			l.click4();
			
			
			
			
		}
			
			
		}




}
