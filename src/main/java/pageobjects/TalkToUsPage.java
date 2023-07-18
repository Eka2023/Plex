package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TalkToUsPage extends BaseMain {

    By firstName = By.id("edit-first-name");
    By lastName = By.id("edit-last-name");
    By businessEmail = By.id("edit-emailaddy");
    By phone = By.id("edit-business-phone");
    By company = By.id("edit-company");
    By title = By.id("edit-title");
    By industryList = By.id("edit-industry-select");
    By countryList = By.id("edit-country");


    public TalkToUsPage(WebDriver dr) {
        super(dr);
    }

    public void fillInForm(String fname, String lname, String bmail, String bphone,
                           String bcompany, String btitle, int indusrty_index, int country_index) {
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(businessEmail).sendKeys(bmail);
        driver.findElement(phone).sendKeys(bphone);
        driver.findElement(company).sendKeys(bcompany);
        driver.findElement(title).sendKeys(btitle);
        getIndustryList().get(indusrty_index);
        getCountryList().get(country_index);
    }

    public List<String> getIndustryList() {
        WebElement dropDownElement = driver.findElement(industryList);
        Select searchDropDown = new Select(dropDownElement);
        List<WebElement> list = searchDropDown.getOptions();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            resultList.add(list.get(i).getText());
        }
        return resultList;
    }

    public List<String> getCountryList() {
        WebElement dropDownElement = driver.findElement(countryList);
        Select searchDropDown = new Select(dropDownElement);
        List<WebElement> list = searchDropDown.getOptions();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            resultList.add(list.get(i).getText());
        }
        return resultList;
    }

}
