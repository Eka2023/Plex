package testcases.homepagetests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testcases.BaseTest;

public class TalkToUsPageTests extends BaseTest {

    @Test
    public void openTalkToUsPageTest() {
        homePage.openTalkToUsPage();
        talkPage.validation("https://www.plex.com/contact-us", talkPage.getCurrentURL());
    }

    @DataProvider(name="testdata")
    public Object[][] testData() {
        return new Object [][] {
                {"First Name", "Last name", "business@email.com", "+11111111111", "Company Name", "Title", "Consmetics", "Albania"}
        };
    }

    @Test
    public void fillInFormTest() {
        homePage.openTalkToUsPage();
        talkPage.fillInForm("First Name", "Last name", "business@email.com", "+11111111111", "Company Name", "Title", 2, 3);
        assetPage.validation("https://www.plex.com/contact-us", assetPage.getCurrentURL());
    }

}
