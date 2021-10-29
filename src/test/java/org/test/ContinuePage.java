package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuePage extends BaseClass{
	
   public ContinuePage() {
	   PageFactory.initElements(driver, this);
	}

   @FindBy(id="radiobutton_0")
   private WebElement radiobtn;
   @FindBy(id="continue")
   private WebElement search;

public WebElement getRadiobtn() {
	return radiobtn;
}

public WebElement getSearch() {
	return search;
}
   
   
   
   
   
   
   
}
