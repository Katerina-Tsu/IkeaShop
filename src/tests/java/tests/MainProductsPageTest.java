package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainProductsPageTest extends BaseTest {

    @Test(groups = "Kate", description = "Open main products page.After that, open Header window for button 'Hey!' ")
    public void openMainPageAndClickHeiSignUpBtnTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();
        mainProductsPage.waitForHeaderWindowWillBeOpen();
        Assert.assertTrue(mainProductsPage.isMainPageOpened());
    }
}
