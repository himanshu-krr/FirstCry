package fristcryTest;

import org.testng.annotations.Test;
import com.fristcry.pages.HomePage;
import com.fristcry.pages.LoginPage;
import com.fristcry.pages.PreschoolLocatorPage;
import com.fristcry.pages.StoreLocatorPage;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTest {
    @Test
    public void testing() throws Exception {
        WebDriver wd = new EdgeDriver();
        wd.get("https://www.firstcry.com/m/login");
        wd.manage().window().maximize();

        LoginPage lp = new LoginPage(wd);
        lp.enterMobileNo("7004481495");
        lp.clickContinue();
        
        lp.submitOTP();

        // ========== Store Locator ==========

        HomePage hp = new HomePage(wd);
        hp.hoverOverStoreAndPreschool();

        // Switch to new Store Locator tab
        ArrayList<String> tabs1 = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs1.get(1));
        Thread.sleep(3000);

        StoreLocatorPage slp = new StoreLocatorPage(wd);
        slp.selectStoreType("FirstCry");
        slp.selectState("Maharashtra");
        slp.selectCity("Pune Kharadi");
        slp.clickSearch();

        // ========== Preschool Locator ==========

        slp.hoverOverStoreAndPreschool();

        // Switch to new Preschool Locator tab
        ArrayList<String> tabs2 = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs2.get(tabs2.size() - 1)); // Switch to last opened tab
        Thread.sleep(3000);

        String expectedHeading = "Preschool Locator";
        String expectedSubheading = "Preschools Near You";

        PreschoolLocatorPage plp = new PreschoolLocatorPage(wd);
        String actualHeading = plp.verifyPreschoolLocator();
        Thread.sleep(2000);
        plp.enterPincode("411014");
        plp.clickSubmit();
        Thread.sleep(2000);
        String actualSubheading = plp.verifyPreschool();

        assertEquals(actualHeading, expectedHeading);
        assertEquals(actualSubheading, expectedSubheading);

        // wd.quit(); // Optional: close browser after test
    }
}