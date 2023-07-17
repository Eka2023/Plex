package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.ERPPage;
import pageobjects.HomePage;
import pageobjects.MESPage;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    public HomePage homePage;
    public MESPage mesPage;
    public ERPPage erpPage;

    @BeforeMethod()
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        homePage = new HomePage(driver);
        homePage.getBaseURL();
//        signInPage = new SignInPage(driver);
//        signUpPage = new SignUpPage(driver);
    }

    @AfterMethod()
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
