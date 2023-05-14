package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;
import test_data.TestConstants;
import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest implements TestConstants {
    WebDriver driver;
    SecondLineContainerTopPage secondLineContainerTopPage;
    Header headerPage;
    SignInToGeneralProductsPage signInToGeneralPage;
    SignInIkeaFamilyAccountProductsPage signInIkeaFamilyAccountPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        initPage();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() { driver.quit(); }

    public void initPage() {
        secondLineContainerTopPage = new SecondLineContainerTopPage(driver);
        headerPage = new Header(driver);
        signInToGeneralPage = new SignInToGeneralProductsPage(driver);
        signInIkeaFamilyAccountPage = new SignInIkeaFamilyAccountProductsPage(driver);
    }
}
