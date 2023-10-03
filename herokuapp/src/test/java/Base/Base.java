package Base;

import Browser.MultipleBrowsers;
import Data.DummyData;
import Pages.Home;
import org.openqa.selenium.WebDriver;
public class Base {
    WebDriver driver ;
    DummyData dummy = new DummyData();
    MultipleBrowsers browser = new MultipleBrowsers(dummy.ReturnBrowserName());
    public void OpenBrowser(){
        browser.BrowserChecker();
        driver = browser.ReturnDriverType();
    }
    public void OpenWebsite(){
        driver.get(dummy.ReturnWebsite());
    }
    public void FirstTestCase (){
        Home home = new Home(driver);
        home.OpenABTesting();
    }
    public void CloseBrowser(){
        driver.close();
    }
}