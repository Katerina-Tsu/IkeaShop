package tests;

import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {

    @Test(groups = "Buttons frame", description = "Sign in to my account")
    public void signInTest() {
        secondLineContainerTopPage.openMainPage();
        secondLineContainerTopPage.clickHejLogInOrSignUpButton();

    }
}
