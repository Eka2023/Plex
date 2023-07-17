package testcases.homepagetests;

import org.testng.annotations.Test;
import testcases.BaseTest;

public class SubMenuPagesTests extends BaseTest {

    @Test
    public void openMESPageTest() {
        homePage.clickSubMenuElement("Manufacturing Execution System");
        mesPage.getPageElement(mesPage.getHeader3()).isDisplayed();
        mesPage.validation("https://www.plex.com/products/manufacturing-execution-system", mesPage.getCurrentURL());

    }



}
