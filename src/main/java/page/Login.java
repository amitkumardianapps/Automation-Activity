package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helpers.BrowserSetup.driver;

public class Login {

    public static final By userNameLocator=By.id("user-name");
    public static final By passwordLocator=By.id("password");
    public static final By loginButtonLocator=By.id("login-button");

}
