package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ERPPage extends BaseMain{

    By header3 = By.xpath("//h3[contains(text(),'Suppliers & Purchasing Management')]");

    public ERPPage(WebDriver dr) {
        super(dr);
    }



}
