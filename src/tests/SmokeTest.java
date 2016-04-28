package tests;

import init.DriverInit;
import pages.StartPage;

/**
 * Created by dshynkarenko on 4/28/2016.
 */
public class SmokeTest extends BaseTest {

    public void checkSearchOnStartPage(){

        StartPage.locateSearchBar(driverUsed);

    }


}
