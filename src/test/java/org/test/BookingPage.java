package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
		
		PageFactory.initElements(driver, this);
		}

	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
    @FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement selectmonth ;
	@FindBy(id="cc_exp_year")
	private WebElement selectyear;
	@FindBy(id="cc_cvv")
	private WebElement ccvno;
	@FindBy(id="book_now")
	private WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}
	

	public WebElement getBooknow() {
		return booknow;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
