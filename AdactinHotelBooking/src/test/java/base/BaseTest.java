package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class BaseTest {

    protected WebDriver driver = Hooks.driver;
    protected WebDriverWait wait = Hooks.wait;

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void type(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    public String getAttribute(By locator, String attr) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getAttribute(attr);
    }
    

    public void selectByValue(By locator, String value) {
           new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)))
                   .selectByValue(value);
       }

    public void selectByText(By locator, String value) {
        new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)))
                .selectByVisibleText(value);
    }
}