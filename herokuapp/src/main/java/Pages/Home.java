package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver ;
    By first_link = By.xpath("//*[@id=\"content\"]/ul/li[1]/a");

    public Home(WebDriver driver){
        this.driver = driver ;
    }

    public void OpenABTesting () {
        driver.findElement(first_link).click();
        System.out.println("#####################");
        System.out.println(driver.getCurrentUrl());
        System.out.println("#####################");

    }
}
