package Pages;

import Data.DummyData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.logging.Logger;

public class Home {
    DummyData data = new DummyData();
    WebDriver driver ;
    Logger log ;
    By add_remove = By.xpath("//div[@id=\"content\"]/ul/li[2]/a");
    By add_button = By.xpath("//div[@class=\"example\"]/button");
    By delete_button = By.xpath("//div[@id=\"elements\"]/button");

    public Home(WebDriver driver , Logger log){
        this.log = log ;
        this.driver = driver ;
    }

    public void OpenAddRemovePage () {
        log.info("click on the page link");
        driver.findElement(add_remove).click();
    }
    public void AddItem(){
        driver.findElement(add_button).click();
        log.info("add button clicked");
    }
    public void CheckDeleteButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfElementLocated(delete_button));
        log.info("delete button appear");
    }

    public void PageCheck(){
        Assert.assertTrue(driver.getCurrentUrl().contains(data.ReturnAddRemoveLink()),"fail");
        log.info("Page opened correctly");
    }

}
