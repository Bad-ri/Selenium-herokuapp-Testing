package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MultipleBrowsers {
    String Type = "" ;
    String Path = System.getProperty("user.dir")+"\\src\\main\\resources\\Driver\\" ;
    String DriverPath = "" ;
    String DriverName = "" ;

    public MultipleBrowsers(String Type){
        this.Type = Type ;
    }
    public void BrowserChecker(){
        if(Type.equals("edge")){
            DriverPath = Path+"msedgedriver.exe";
            DriverName = "webdriver.edge.driver";
        }
        else if (Type.equals("chrome")) {
            DriverPath = Path+"chromedriver.exe";
            DriverName = "webdriver.chrome.driver";
        }
        System.setProperty(DriverName,DriverPath);
    }
    public WebDriver ReturnDriverType(){
        if(Type.equals("edge")){
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--headless");
            System.out.println(options.getBrowserName());
            return new EdgeDriver(options) ;
        }
        else if(Type.equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--headless");
            System.out.println(options.getBrowserName());
            return new ChromeDriver(options);
        }
        return null ;
    }


}
