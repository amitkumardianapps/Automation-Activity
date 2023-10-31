package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public final class WaitUtility {
    private final WebDriverWait wait;

    public WaitUtility(WebDriver driver, Duration duration) {
        this.wait = new WebDriverWait(driver, duration);
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
