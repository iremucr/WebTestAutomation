package GeneralFiles;

import BaseFiles.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver=null;

    public BasePage(){
        driver= DriverManager.getDriver();
    }


    public void  clickElement(By locator){
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
