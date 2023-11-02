package pageoperations;

import helpers.ScrollHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static helpers.BrowserSetup.driver;
import static page.Cart.*;

public class CartOperations {

    public static void clickCart(){
        ScrollHelper.scroll(0,-100);
        WebElement cartButton = driver.findElement(cartButtonLocator);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cartButton);
        cartButton.click();

    }

}
