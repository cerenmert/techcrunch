package TechCrunch;

import TechCrunch.Pages.EventsPage;
import TechCrunch.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class EventsPageTest extends BaseTest {

    @Test
    public void verifyListedDatesAndEventNamesContainSelectedYear() throws InterruptedException {
        String eventType = "Meetups";
        String year = "2017";
        HomePage homePage = new HomePage(webDriver);
        EventsPage eventsPage = homePage.clickOnUpcomingEventsSeeMoreButton();
        eventsPage.selectAnEventTypeForPastEvents(eventType);
        eventsPage.selectAYearForPastEvents(year);
        Thread.sleep(3000);
        List<WebElement> eventNamesList = eventsPage.getEventNameList();
        eventNamesList.forEach(event ->
                Assert.assertTrue(event.getText().contains(year), "Event year not found in: " + event.getText()));
        List<WebElement> eventYearList = eventsPage.getEventDateList();
        eventYearList.forEach(event ->
                Assert.assertTrue(event.getText().contains(year), "Event year not found in: " + event.getText()));
    }

}
