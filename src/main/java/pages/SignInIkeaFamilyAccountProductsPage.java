package pages;

import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SignInIkeaFamilyAccountProductsPage extends SecondLineContainerTopPage {


    public SignInIkeaFamilyAccountProductsPage(WebDriver driver) { super(driver);}

    @Step("Opening the sign in ikea family account page")
    @Link("https://us.accounts.ikea.com/login?state=hKFo2SBCUUtsRUZta29lZEJPaE5MeDFHRzg0aC1tbV80UGtmY6FupWxvZ2luo3RpZNkgR2dvaWVKU2Q3d1JUQ3FfWlEtY0I5TFFpZTJONGJSd1ejY2lk2SBBRHpFb3NGaUZiOXY5SHVqSDc4RTVrVjIyNjdVMXZONA&client=ADzEosFiFb9v9HujH78E5kV2267U1vN4&protocol=oauth2&page=family_signup&redirect_uri=https%3A%2F%2Fwww.ikea.com%2Fus%2Fen%2Fprofile%2Flogin%2F&response_type=code&ui_locales=en-US&code_challenge=oMKe5opg5k_9OxupZQJvSywzzeQ_892BOsITAmId1O4&code_challenge_method=S256&scope=openid%20profile%20email%20offline_access&itm_source=logged-out%7Cslider%7Csignup&audience=https%3A%2F%2Fretail.api.ikea.com&consumer=OWF&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4xOS4xIn0%3D&gasid=GA1.1.482239783.1678045231&sessId=e1c872d1-d2d2-4f0f-a562-b64fc3a58032&expUserId=9797bf18-11df-4ec1-b27b-e76d7c3eeb99")
    public void openSignInIkeaFamilyAccountPage() { driver.get(SIGN_IN_IKEA_FAMILY_ACCOUNT_URL);}


}
