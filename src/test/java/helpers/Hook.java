package helpers;

import org.openqa.selenium.WebDriver;
import utilities.GlobalVariable;

import java.util.concurrent.TimeUnit;

public class Hook {
    public WebDriver driver;

    public WebDriver browser(String browser, String url) {
        try {
            boolean browserFound = true;
            if (browser.toUpperCase().equals("CHROME")) {
                System.setProperty("webdriver.chrome.driver", GlobalVariable.AUT_BROWSER_SERVER_PATH_CHROME);

            } else {
                browserFound = false;
            }
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            if (browserFound) {
                driver.manage().window().maximize();
                driver.get(url);
            }
        } catch (AssertionError e) {
            System.out.println(e);
        }
        return driver;
    }
}
