package tests;

import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    @Test(groups = "Katia", description = "When the correct email address has been entered. After that, we went to the account creation page.", priority = 1)
    public void createTheAccountTest() {
        signInToGeneralPage.openSignInToGeneralPage();
    }
}
