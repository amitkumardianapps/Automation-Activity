package pageoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helpers.WaitUtility;
import java.time.Duration;
import static helpers.BrowserSetup.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ProductsOperations {


    public static void addToCart() {

        String[] itemsToAdd = {"Sauce Labs Backpack", "Sauce Labs Onesie"};
        WaitUtility waitUtility = new WaitUtility(driver, Duration.ofSeconds(10));

        for (String itemToAdd : itemsToAdd) {
            WebElement item = waitUtility.getWait().until(visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_label']//a//div[contains(text(), '" + itemToAdd + "')]")));
            WebElement addToCartButton = item.findElement(By.xpath("./ancestor::div[@class='inventory_item']//button[@class='btn_primary btn_inventory']"));
            addToCartButton.click();
            System.out.println("Added " + itemToAdd + " to the cart.");
        }
    }
}
