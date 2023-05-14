package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainProductsPageTest extends BaseTest {

    @Test(groups = "Header window. Right side", description = "Open main products page.After that, open Header window for button 'Hej!' ")
    public void openMainPageAndClickHeiSignUpBtnTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();
        mainProductsPage.waitForHeaderWindowWillBeOpen();
        Assert.assertTrue(mainProductsPage.isMainPageOpened()); //need to change the locator from MainPage to HeaderWindow.
    }

    @Test(groups = "Header window. Right side", description = "Open main products page.After that, open Header window for button 'Hej!'. Click closing button. ")
    public void openHeaderWindowAndCloseByCrossTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();
        mainProductsPage.waitForHeaderWindowWillBeOpen();
        mainProductsPage.clickInHeaderWindowCrossButton();
        Assert.assertTrue(mainProductsPage.isMainPageOpened());
    }

    @Test(groups = "Header window. Right side", description = "Open main products page.Open Header window for button 'Hej!'. Click in other place in page/overlay. ")
    public void openHeaderWindowAndCloseByOtherSpaceOnPageTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();
        mainProductsPage.waitForHeaderWindowWillBeOpen();
        mainProductsPage.closeHeaderWindowByOtherSpace();
        mainProductsPage.waitForHeaderWindowWillBeClosed();
        Assert.assertTrue(mainProductsPage.isMainPageOpened());
    }
}
