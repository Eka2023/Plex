package testcases.homepagetests;

import org.testng.annotations.Test;
import testcases.BaseTest;

public class ContactPageTests extends BaseTest {

    @Test
    public void openContactPageTest() {
        homePage.openContactUsPage();
        System.out.println(homePage.getCurrentURL());

    }

}
