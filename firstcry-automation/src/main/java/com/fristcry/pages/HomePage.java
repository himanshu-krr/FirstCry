package com.fristcry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver wd;

    By stores = By.xpath("//span[text()='Stores & Preschools']");
    By findStores = By.xpath("//a[@href='//www.firstcry.com/store-locator?ref2=topstrip']");

    public HomePage(WebDriver wd) {
        this.wd = wd;
    }

    public void hoverOverStoreAndPreschool() throws InterruptedException {
        WebElement storesPreschools = wd.findElement(stores);


        Actions a = new Actions(wd);
        a.moveToElement(storesPreschools).perform();


        Thread.sleep(5000);


        WebElement findStore = wd.findElement(findStores);
        a.moveToElement(findStore).click().perform();
    }
}