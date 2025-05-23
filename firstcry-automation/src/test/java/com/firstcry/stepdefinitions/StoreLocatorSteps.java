//package com.firstcry.stepdefinitions;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import com.fristcry.pages.StoreLocatorPage;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StoreLocatorSteps {
//    WebDriver driver = Hooks.getDriver();
//    StoreLocatorPage storePage = new StoreLocatorPage(driver);
//
//    @Given("user is on Firstcry homepage")
//    public void navigateToHomepage() {
//        driver.get("https://www.firstcry.com");
//    }
//
//    @When("user logs in with mobile number {string} and OTP {string}")
//    public void login(String mobile, String otp) {
//        // login code (based on your UI – insert if available)
//    }
//
//    @When("user hovers on {string}")
//    public void hoverOnMenu(String menu) {
//        storePage.hoverOnStoresMenu();
//    }
//
//    @When("user clicks on {string}")
//    public void clickOnLink(String link) {
//        if (link.equals("Find Stores")) storePage.clickFindStores();
//    }
//
//    @When("user selects store type {string}")
//    public void selectStoreType(String type) {
//        storePage.selectStoreType(type);
//    }
//
//    @When("user selects state {string}")
//    public void selectState(String state) {
//        storePage.selectState(state);
//    }
//
//    @When("user selects city {string}")
//    public void selectCity(String city) {
//        storePage.selectCity(city);
//    }
//
//    @When("user clicks on Search")
//    public void clickSearch() {
//        storePage.clickSearch();
//    }
//
//    @Then("user should see store details")
//    public void verifyStoreDetails() {
//        Assert.assertTrue(storePage.isStoreDisplayed());
//    }
//
//    @When("user clicks on Search without selecting any filter")
//    public void clickSearchWithoutFilters() {
//        storePage.clickSearch();
//    }
//
//    @Then("user should not see any results")
//    public void verifyNoResults() {
//        Assert.assertFalse(storePage.isStoreDisplayed());
//    }
//}
