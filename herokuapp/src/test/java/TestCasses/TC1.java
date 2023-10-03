package TestCasses;

import Base.Base;
import Browser.MultipleBrowsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {
       Base test = new Base() ;
       test.OpenBrowser();
       test.OpenWebsite();
       Thread.sleep(2000);
       test.FirstTestCase();
       test.CloseBrowser();
    }
}
