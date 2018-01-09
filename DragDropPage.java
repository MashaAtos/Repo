package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static setup.DriverSetup.getDriver;

public class DragDropPage extends BasePage {

    private WebElement From = find(By.id("column-a"));
    private WebElement To = find(By.id("column-b"));
    public DragDropPage(WebDriver webDriver) {
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl() {return BASE_URL + "/drag_and_drop";}


    public void DragAndDrop() {
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).build();
        dragAndDrop.perform();
    }
}
