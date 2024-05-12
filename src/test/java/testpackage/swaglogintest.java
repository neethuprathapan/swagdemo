package testpackage;

import org.testng.annotations.Test;

import basepackage.baseclass;
import pagepackage.swagloginpage;
import utilities.excelutils;

//import basepackage.baseclass;

public class swaglogintest extends baseclass
{
	@Test(priority=1)
	public void loginverification() 
	{
		swagloginpage sp=new swagloginpage(driver);
		String xl="C:\\Users\\neethu321\\OneDrive\\Desktop\\Book 2.xlsx";
		String sheet="Sheet1";
		int rowCount = excelutils.getRowCount(xl, sheet);
		System.out.println(rowCount);
       for (int i=1;i<rowCount;i++)
        {
              String UserName=excelutils.getCellValue(xl, sheet, i, 0);
              System.out.println("username---"+UserName);
              String Pwd=excelutils.getCellValue(xl, sheet, i, 1);
              System.out.println("password---"+Pwd);
              
              
              sp.setvalues(UserName, Pwd);
              sp.click();
              
              
        }
	}
       
       @Test(priority=2)
   	   public void addcart() throws Exception
       {
    	   swagloginpage sp=new swagloginpage(driver);
    	   sp.cart();
    	  // Thread.sleep(2000);
    	   sp.cartbutton();
    	   Thread.sleep(2000);
    	   sp.checkout();
       }
       
       @Test(priority=3)
       public void personaldetails() throws Exception
       {
    	   swagloginpage sp=new swagloginpage(driver);
    	   sp.personal();
    	   Thread.sleep(2000);
    	   sp.continuee();
    	   
       }
       @Test(priority=4)
       public void hamburger() throws Exception
       {
    	   swagloginpage sp=new swagloginpage(driver);
    	   sp.sidemenu();
    	   Thread.sleep(2000);
    	   sp.itembutton();
    	   Thread.sleep(2000);
    	   sp.sidemenu();
    	   Thread.sleep(2000);
    	   sp.logout();
    	   
       }
}

	
       
       
       
             
	
	
		
	
		
	

