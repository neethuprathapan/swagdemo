package pagepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swagloginpage
{
	WebDriver driver;
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(name = "login-button")
	WebElement login;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement item1;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement item2;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement item3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement item4;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement item5;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement item6;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement  postalcose;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuee;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburger;
	
	@FindBy(xpath="//*[@id=\"inventory_sidebar_link\"]")
	WebElement allitems;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	
	public swagloginpage(FirefoxDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setvalues(String un,String pswd)
	{
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pswd);
	}
	public void click()
	{
		login.click();
	}
	public void cart()
	{
		/*item1.click();
		item2.click();
		item3.click();
		item4.click();
		item5.click();
		item6.click();*/
		
		List<WebElement> li=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
		for(WebElement st:li)
		{
			if(st.getText().equals("Add to cart"))
			{
				st.click();
			}
			else
			{
				System.out.println("Not available");
			}
		}
	}
	public void cartbutton()
	{
		cart.click();
	}
    public void checkout()
    {
    	checkout.click();
    }
    public void personal()
    {
    	firstname.sendKeys("Neethu");
    	lastname.sendKeys("Prathapan");
    	postalcose.sendKeys("688541");
    }
    public void continuee()
    {
    	continuee.click();
    }
    public void sidemenu()
    {
    	hamburger.click();
    }
    public void itembutton()
    {
    	allitems.click();
    }
    public void logout()
    {
    	logout.click();
    }
    public void clear()
    {
    	username.clear();
    	password.clear();
    }
}
