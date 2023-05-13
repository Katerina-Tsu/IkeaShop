package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainProductsPageTest extends BaseTest {

    @Test(groups = "Header window", description = "Open main products page.After that, open Header window for button 'Hej!' ")
    public void openMainPageAndClickHeiSignUpBtnTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();
        mainProductsPage.waitForHeaderWindowWillBeOpen();
        Assert.assertTrue(mainProductsPage.isMainPageOpened()); //need to change the locator from MainPage to HeaderWindow.
    }

    @Test(groups = "Header window", description = "Open main products page.After that, open Header window for button 'Hej!'. Click closing button. ")
    public void openHeaderWindowAndCloseByCrosseTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();
        mainProductsPage.waitForHeaderWindowWillBeOpen();
        mainProductsPage.clickInHeaderWindowCrossButton();
        Assert.assertTrue(mainProductsPage.isMainPageOpened());
    }
}
