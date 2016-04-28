package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by dshynkarenko on 4/28/2016.
 */
public class StartPage extends Page {

    static String searchBarLocator = "/html/body/div/div[2]/div/div/div[1]/div/igov-search/div/form/input" ;



    public static void locateSearchBar (WebDriver driver) {

        driver.findElement(By.xpath(searchBarLocator));

    }
    public static void checkSearchBar (WebDriver driver) {

        driver.findElement(By.xpath(searchBarLocator));

    }

}
