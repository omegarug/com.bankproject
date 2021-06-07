package cucumberhooks;

import Base.BasePage;
import Pages.GMIHomePage;
import Utils.ConfigReaders;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {
    public BasePage basePage;
    public WebDriver driver;
    public ConfigReaders configReaders;
    public Properties prop;
    public GMIHomePage homePage;

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
        driver = basePage.init_driver(browserType); }

    @After
    public void tearDown(){
        driver.quit();
    }

}
