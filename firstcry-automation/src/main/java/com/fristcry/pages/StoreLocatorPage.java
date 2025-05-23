package com.fristcry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class StoreLocatorPage {
	
	
    WebDriver driver;

   
    By storeTypeDropdown = By.xpath("//select[@id='storetype']");
    By stateDropdown = By.xpath("//select[@name='state']");
    By cityDropdown = By.xpath("//select[@name='city']");
    By searchButton = By.xpath("//input[@type='button']");
    By storeLocator = By.xpath("//span[@class='p1']");
    By verifystores = By.xpath("//label[@id='citynme']");
    By stores = By.xpath("//span[text()='Stores & Preschools']");
    By findPreschools = By.xpath("//a[@href='https://www.firstcry.com/intelli/intellitots/preschool-near-you/?ref2=topstrip']");

    public StoreLocatorPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String verifyStorePage()
    {
    	String actual = driver.findElement(storeLocator).getText();
    	return actual;
    	
    }

    public void selectStoreType(String storeType) {
        Select select = new Select(driver.findElement(storeTypeDropdown));
        select.selectByVisibleText(storeType);
    }

    public void selectState(String state) {
        Select select = new Select(driver.findElement(stateDropdown));
        select.selectByVisibleText(state);
    }

    public void selectCity(String city) {
        Select select = new Select(driver.findElement(cityDropdown));
        select.selectByVisibleText(city);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
    
    public String verifyStore()
    {
    	String actual = driver.findElement(verifystores).getText();
    	return actual;
    }
    
    public void hoverOverStoreAndPreschool() throws InterruptedException {
        WebElement storesPreschool = driver.findElement(stores);


        Actions a = new Actions(driver);
        a.moveToElement(storesPreschool).perform();


        Thread.sleep(5000);


        WebElement findPreschool = driver.findElement(findPreschools);
        a.moveToElement(findPreschool).click().perform();
    }
 
}
