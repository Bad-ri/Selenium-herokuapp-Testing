package Base;

import Browser.MultipleBrowsers;
import Data.DummyData;
import Pages.Home;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Base {
    public WebDriver driver ;
    DummyData dummy = new DummyData();
    MultipleBrowsers browser = new MultipleBrowsers(dummy.ReturnBrowserName());
    public Logger log = Logger.getLogger("HAKONA");
    public Home home ;

    public void OpenBrowser(){
        LogSetup();
        log.info("open browser");
        browser.BrowserChecker();
        driver = browser.ReturnDriverType();
        ObjectSetup();
    }
    public void OpenWebsite(){
        log.info("open website");
        driver.get(dummy.ReturnWebsite());
    }

    public void CloseBrowser(){
        log.info("close browser");
        driver.close();
    }

    public void LogSetup(){
        try {
            FileHandler file_handler = new FileHandler("Logger_File.log");
            file_handler.setFormatter(new SimpleFormatter());
            log.addHandler(file_handler);
        }catch(IOException e){
            log.severe("Error while access the LOG file");
        }
    }

    public void ObjectSetup(){
        home = new Home(driver , log);
    }
}