package pages;

import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderWindow extends BasePage {

    @FindBy(xpath = "//*[@class='header']//ancestor::*[contains(text(),'Sign in')]")
    WebElement signInInHeaderBtn;

    @FindBy(xpath = "//*[@role='button']//ancestor::*[contains(text(),'Sign in')]")
    WebElement signInInHeaderShownBtn;

    @FindBy(xpath = "//*[@class='sc-bdVaJa sc-exAgwC hfVlac']")
    WebElement generalSignInLabel;


    public HeaderWindow(WebDriver driver) {

        super(driver);
    }

    @Step("Click on button in header: Sign in ")
    public  void clickSignInButton() { signInInHeaderBtn.click();}

    public boolean isSignInInHeaderButtonShown() {return signInInHeaderShownBtn.isDisplayed(); }

    public void waitUntilGeneralSignInPageOpened() { wait.until(ExpectedConditions.visibilityOf(generalSignInLabel)); }

}
