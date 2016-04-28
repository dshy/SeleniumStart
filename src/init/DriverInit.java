package init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by dshynkarenko on 4/21/2016.
 */
public class DriverInit {

    public static WebDriver DriverInit(String startPageUrl, String driverType) {

        String defaultStartPageUrl = "https://igov.org.ua/";
        String defaultDriverType = "firefox";
        WebDriver driver;

        if (driverType.equals("firefox")) {
            driver = new FirefoxDriver();

        } else if (driverType.equals("ie")) {
            driver = new InternetExplorerDriver();

        } else {
            driver = new FirefoxDriver();

        }

        if (startPageUrl != null) {
            driver.get(startPageUrl);

        } else
            driver.get(defaultStartPageUrl);
        return driver;
    }
}
