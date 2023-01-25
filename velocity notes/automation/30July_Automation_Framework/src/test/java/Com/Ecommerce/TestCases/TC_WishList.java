package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Wishlist;

public class TC_WishList extends Ecommerce_BaseClass 
{
	@Test
	public void wishlist() throws InterruptedException
	{
		TC_Ecommerce_Wishlist obj = new TC_Ecommerce_Wishlist();
		logger.info("open url");
		
		
		obj.book();
		logger.info("click on book");
		
		obj.wish();
		logger.info("click on wish");
		
		obj.MSG();
		logger.info("msg displayed");
		
		WebElement ClkWishlist1 = driver.findElement(By.xpath("(//a[@href=\"/wishlist\"])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ClkWishlist1);
		Thread.sleep(3000);
		
		obj.Wish1();
		logger.info("click on wishlist");
//		logger.info("click on addto cart");
//		obj.Addcart();
		
	}
	

}
