package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_Wishlist extends Ecommerce_BaseClass 
{
	public TC_Ecommerce_Wishlist()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"/books\"]")
	WebElement Book;
	
	@FindBy(xpath = "(//button[@class=\"button-2 add-to-wishlist-button\"])[1]")
	WebElement Wish;
	
	@FindBy(xpath = "//p[@class=\"content\"]")
	WebElement Msg;
	
	@FindBy(xpath = "(//a[@href=\"/wishlist\"])[1]")
	WebElement ClkWishlist;
	
//	 @FindBy(xpath = "//button[@name=\"addtocartbutton\"]")
//    WebElement addCart;
    
    public void book() {
		Book.click();
	}
	public void wish() {
		Wish.click();
	}
	
	public void MSG() throws InterruptedException {
		boolean B =Msg.isDisplayed();
		System.out.println(B);
		String A = Msg.getText();
		System.out.println(A);
		Thread.sleep(1000);
	}
	public void Wish1() {
		ClkWishlist.click();
	}
	
//	public void Addcart() {
//		addCart.click();
//	}
//	
	
	

}
