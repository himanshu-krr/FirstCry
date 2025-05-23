package com.fristcry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PreschoolLocatorPage {
	
    WebDriver driver;

    By verifyPreschoolPage = By.xpath("//*[@id=\"scrollHeight\"]/app-locator-listing/div[2]/div/h2");
    By pincodeInput = By.xpath("//*[@id=\"scrollHeight\"]/app-locator-listing/div[2]/div/div[2]/div[1]/input");
    By submitButton = By.xpath("//*[@id=\"scrollHeight\"]/app-locator-listing/div[2]/div/div[2]/div[2]/button/div");
    By errorMessage = By.xpath("//*[contains(text(),\"Ooopss\")]");
    By verifyPreschool = By.xpath("//p[text()='Preschools Near You ']");

    public PreschoolLocatorPage(WebDriver driver) {
        this.driver = driver;
    }

    
    public String verifyPreschoolLocator()
    {
    	String actual = driver.findElement(verifyPreschoolPage).getText();
    	return actual;
    }
    
    public void enterPincode(String pincode) {
        driver.findElement(pincodeInput).clear();
        driver.findElement(pincodeInput).sendKeys(pincode);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isSubmitDisabled() {
        return !driver.findElement(submitButton).isEnabled();
    }
    
    public String verifyPreschool()
    {
    	String actual = driver.findElement(verifyPreschool).getText();
    	return actual;
    }
}
