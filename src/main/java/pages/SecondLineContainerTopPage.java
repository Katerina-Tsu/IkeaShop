package pages;

import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecondLineContainerTopPage extends BasePage {


    @FindBy(xpath = "//*[@id='little-man-slider']")
    WebElement headerWindowInMainPageLabel;

    @FindBy(xpath = "//*[@id='content']")
    WebElement mainPageLabel;

    public SecondLineContainerTopPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open main shop page")
    @Link("https://www.ikea.com/us/en")
    public void openMainPage() {
        driver.get(IKEA_SHOP_URL);
    }

    public boolean isMainPageOpened() {return headerWindowInMainPageLabel.isDisplayed(); }

    public void waitForHeaderWindowWillBeOpen() {
        wait.until(ExpectedConditions.visibilityOf(headerWindowInMainPageLabel));
    }

    public void waitForHeaderWindowWillBeClosed() {
        wait.until(ExpectedConditions.visibilityOf(mainPageLabel));
    }

    @Step("Click on button in header: Hej! Log in or sign up ")
    public void clickHejLogInOrSignUpButton() {
        driver.findElement(By.xpath("//*[@id='loyalty-modal-button']")).click(); }

    public void clickInHeaderWindowCrossButton() {
        driver.findElement(By.xpath("//*[@id='close-button']")).click(); }

    public void closeHeaderWindowByOtherSpace() {
        driver.findElement(By.xpath("//*[@id='loyalty-modal__modal-closer']")).click(); }
}
