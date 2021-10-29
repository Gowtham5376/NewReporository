package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Launch  extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		getDriver("https://adactinhotelapp.com/");
		
		AdactinLoginPOM a= new AdactinLoginPOM();
		
		WebElement txtusername = a.getUsername();
		String text = excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 0);
		
	   sendkeys(txtusername, text);
		
		WebElement txtpassword = a.getPassword();
		String pass = excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 1);
		sendkeys(txtpassword, pass);
		
		a.getLogin().click();
		
		
		DetailPage b = new DetailPage();
		
		WebElement location = b.getLocation();
		selectByVisibleText(location, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 2));
		
		WebElement hotels = b.getHotels();
		selectByVisibleText(hotels, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 3));
		
		WebElement roomtype = b.getRoomtype();
		selectByVisibleText(roomtype, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 4));
		
		WebElement noofrooms = b.getNoofrooms();
		selectByVisibleText(noofrooms, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 5));
		
		WebElement checkindate = b.getCheckindate();
		b.clear(checkindate);
		sendkeys(checkindate, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 6));
	
		WebElement checkoutdate = b.getCheckoutdate();
		b.clear(checkoutdate);
		sendkeys(checkoutdate, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 7));
		
		
		WebElement adultperrm = b.getAdultperrm();
		selectByVisibleText(adultperrm, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 8));
		
		WebElement childroom = b.getChildroom();
		selectByVisibleText(childroom, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 9));
	    
		WebElement search = b.getSearch();
		b.click(search);
		
		
		ContinuePage c = new ContinuePage();
		WebElement radiobtn = c.getRadiobtn();
		b.click(radiobtn);
		
		WebElement search2 = c.getSearch();
		b.click(search2);
		
		BookingPage d= new BookingPage();
		
		WebElement firstname = d.getFirstname();
		sendkeys(firstname, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 10));
		
		WebElement lastname = d.getLastname();
		sendkeys(lastname, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 11));
		
		
		WebElement address = d.getAddress();
		sendkeys(address, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 12));
		
		WebElement ccnum = d.getCcnum();
		sendkeys(ccnum, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 13));
		WebElement cctype = d.getCctype();
		sendkeys(cctype, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 14));
		
		WebElement selectmonth = d.getSelectmonth();
		sendkeys(selectmonth, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 15));
		
		WebElement selectyear = d.getSelectyear();
		sendkeys(selectyear, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 16));
		
		WebElement ccvno = d.getCcvno();
		sendkeys(ccvno, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 17));
		
		WebElement booknow = d.getBooknow();
		b.click(booknow);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
