package GeneralFiles;

import BaseFiles.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BasePage {
    WebDriver driver=null;

    public BasePage(){
        driver= DriverManager.getDriver();
    }

    public WebElement waitUntillClickable(By locator){
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)

                    .withTimeout(Duration.ofSeconds(30)).withTimeout(Duration.ofSeconds(30))

                    .pollingEvery(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5))

                    .ignoring(NoSuchElementException.class).ignoring(NoSuchElementException.class);

            return  wait.until(ExpectedConditions.elementToBeClickable(locator));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void  clickElement(By locator){
        try {
            waitUntillClickable(locator).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
 