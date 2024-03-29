package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SecondLineContainerTopPageTest extends BaseTest {

    @Test(groups = "Header window. Right side", description = "Open main products page.After that, open Header window for button 'Hej!' ")
    public void openMainPageAndClickHeiSignUpBtnTest() {
        mainPage.openMainPage();
        secondLineContainerTopPage.clickHejLogInOrSignUpButton();
        secondLineContainerTopPage.waitForHeaderWindowWillBeOpen();
        Assert.assertTrue(secondLineContainerTopPage.isMainPageOpened()); //need to change the locator from MainPage to HeaderWindow.
    }

    @Test(groups = "Header window. Right side", description = "Open main products page.After that, open Header window for button 'Hej!'. Click closing button. ")
    public void openHeaderWindowAndCloseByCrossTest() {
        mainPage.openMainPage();
        secondLineContainerTopPage.clickHejLogInOrSignUpButton();
        secondLineContainerTopPage.waitForHeaderWindowWillBeOpen();
        secondLineContainerTopPage.clickInHeaderWindowCrossButton();
        Assert.assertTrue(secondLineContainerTopPage.isMainPageOpened());
    }

    @Test(groups = "Header window. Right side", description = "Open main products page.Open Header window for button 'Hej!'. Click in other place in page/overlay. ")
    public void openHeaderWindowAndCloseByOtherSpaceOnPageTest() {
        mainPage.openMainPage();
        secondLineContainerTopPage.clickHejLogInOrSignUpButton();
        secondLineContainerTopPage.waitForHeaderWindowWillBeOpen();
        secondLineContainerTopPage.closeHeaderWindowByOtherSpace();
        secondLineContainerTopPage.waitForHeaderWindowWillBeClosed();
        Assert.assertTrue(secondLineContainerTopPage.isMainPageOpened());
    }

    @Test(groups = "Header window. Right side", description = "Open Header window for button 'Hej!'. Click sign in common button. ")
    public void signInCommonBtnTest() {
        mainPage.openMainPage();
        secondLineContainerTopPage.clickHejLogInOrSignUpButton();
        secondLineContainerTopPage.waitForHeaderWindowWillBeOpen();
        secondLineContainerTopPage.clickSignInCommonButton();
//        secondLineContainerTopPage.displayedLoginPage();
        Assert.assertTrue(secondLineContainerTopPage.foundLoginPageLabel());

    }
}
