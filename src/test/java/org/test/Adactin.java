package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
	
public static void main(String[] args) throws IOException {
	
	getDriver("https://adactinhotelapp.com/");
	
	WebElement txtUsername = locator("id", "username");
	sendkeys(txtUsername, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 0));
	WebElement txtpass = locator("id", "password");
    sendkey(txtpass, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 1));
    WebElement button = locator("id", "login");
    click(button);
    WebElement location = locator("id", "location");
    selectByVisibleText(location, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 2));
    WebElement hotels = locator("id", "hotels");
    selectByVisibleText(hotels, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 3));
    WebElement roomtype = locator("id", "room_type");
    selectByVisibleText(roomtype, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 4));
    WebElement noofrooms = locator("id", "room_nos");
    selectByVisibleText(noofrooms, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 5));
    WebElement indate = locator("id", "datepick_in");
    indate.clear();
    sendkeys(indate, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 6));
    WebElement outdate = locator("id", "datepick_out");
    outdate.clear();
    sendkeys(outdate, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 7));
    WebElement adult = locator("id", "adult_room");
    selectByVisibleText(adult, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 8));
    WebElement child = locator("id", "child_room");
    selectByVisibleText(child, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 9));
    WebElement submit = locator("id", "Submit");
    click(submit);
    WebElement radiobt = locator("id", "radiobutton_0");
    click(radiobt);
    WebElement cntnbt = locator("id", "continue");
    click(cntnbt);
    WebElement frstname = locator("id", "first_name");
    sendkeys(frstname, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 10));
    WebElement lstname = locator("id", "last_name");
  sendkeys(lstname, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 11));
  WebElement adrs = locator("id", "address");
  sendkeys(adrs, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 12));
  WebElement crdno = locator("id", "cc_num");
  sendkeys(crdno, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 13));
  WebElement crdtype = locator("id", "cc_type");
  sendkeys(crdtype, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 14));
  WebElement crdexpmnth = locator("id", "cc_exp_month");
  sendkeys(crdexpmnth, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 15));
  WebElement crdexpyear = locator("id", "cc_exp_year");
  sendkeys(crdexpyear, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 16));
    WebElement ccv = locator("id", "cc_cvv");
    sendkeys(ccv, excelRead("E:\\Task\\Adactin.xlsx", "abcd", 1, 17));
    WebElement bkbtn = locator("id", "book_now");
    click(bkbtn);
    WebElement ordno = locator("name", "order_no");
    String excel = getAttribute(ordno);
    writeExcel("D:\\New folder\\execute.xlsx","gow",0,0,excel);
    
    
    
    
	
    
    
    
	
}
}
