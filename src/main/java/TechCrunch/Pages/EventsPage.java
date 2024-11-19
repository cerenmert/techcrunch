package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EventsPage extends BasePage {

    // Event type and year selectbox has an IDs, but they are changing dynamically.
    // So, select[name=filterByType] and select[name=filterByYear] are used. They are unique and stable.
    By eventTypeSelectBoxUnderPastEventsLabel = By.cssSelector("select[name=filterByType]");
    By yearSelectboxUnderPastEventsLabel = By.cssSelector("select[name=filterByYear]");
    By eventTypeOptions = By.cssSelector("select[name=filterByType] option");
    By yearSelectboxOptionsUnderPastEventsLabel = By.cssSelector("select[name=filterByYear] option");
    By listedEventNames = By.cssSelector(".wp-block-tc23-past-events__listing-title-link");
    By listedDates = By.cssSelector(".wp-block-tc23-past-events__listing-meta-date");

    public EventsPage(WebDriver driver) {
        super(driver);
    }

    public void selectAnEventTypeForPastEvents(String eventType)  {
        webDriver.findElement(eventTypeSelectBoxUnderPastEventsLabel).click();
        List<WebElement> options = webDriver.findElements(eventTypeOptions);
        options.stream().filter(option -> option.getText().equals(eventType)).findAny().get().click();
    }

    public void selectAYearForPastEvents(String year)  {
        webDriver.findElement(yearSelectboxUnderPastEventsLabel).click();
        List<WebElement> options = webDriver.findElements(yearSelectboxOptionsUnderPastEventsLabel);
        options.stream().filter(option -> option.getText().equals(year)).findAny().get().click();
    }

    public List<WebElement> getEventNameList() {
        return webDriver.findElements(listedEventNames);
    }

    public List<WebElement> getEventDateList() {
        return webDriver.findElements(listedDates);
    }



}
