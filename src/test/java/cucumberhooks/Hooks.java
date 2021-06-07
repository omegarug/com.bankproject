package cucumberhooks;

import Base.BasePage;
import Utils.ConfigReaders;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {


    //just testing
    private BasePage basePage;
    private WebDriver driver;
    private ConfigReaders configReaders;
    public Properties prop;

    // before all test initilaze prop file
    @Before
    public void getProperty(){
        configReaders = new ConfigReaders();
        prop = configReaders.initilaze_prop();
    }
    @Before
    public void lunchBrowser(){
        String browserType = prop.getProperty("browser"); // pick what browser to lunch
        basePage = new BasePage();
        driver = basePage.init_driver(browserType);

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
