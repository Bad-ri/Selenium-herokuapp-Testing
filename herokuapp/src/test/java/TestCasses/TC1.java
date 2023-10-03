package TestCasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {
        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\Driver\\msedgedriver.exe";
        String edge = "webdriver.edge.driver" ;
        System.setProperty(edge,path);
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/watch?v=fED6P8l8Saw&ab_channel=MatchGamed");
        Thread.sleep(Long.parseLong("5"));
        driver.quit();


    }
}
