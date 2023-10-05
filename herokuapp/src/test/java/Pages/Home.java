package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

public class Home {
    WebDriver driver ;
    Logger log ;
    By add_remove = By.xpath("//div[@id=\"content\"]/ul/li[2]/a");

    public Home(WebDriver driver , Logger log){
        this.log = log ;
        this.driver = driver ;
    }

    public void OpenAddRemovePage () {
        log.info("click on the page link");
        driver.findElement(add_remove).click();
        log.info(driver.getCurrentUrl());

    }

}
