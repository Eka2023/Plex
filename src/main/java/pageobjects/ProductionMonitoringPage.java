package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class ProductionMonitoringPage extends BaseMain{
    By header3 = By.xpath("//h3[contains(text(),'Reporting and Extensibility')]");



    public ProductionMonitoringPage(WebDriver dr) {
        super(dr);
    }

    public WebElement getPageElement(By locator){
        return driver.findElement(locator);
    }
}
