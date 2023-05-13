package tests;

import org.testng.annotations.Test;

public class HeaderWindowTest extends BaseTest {

    @Test(groups = "Kate", description = "Sign in to my account")
    public void signInTest() {
        mainProductsPage.openMainPage();
        mainProductsPage.clickHejLogInOrSignUpButton();

    }
}
