package steps;

import BaseFiles.JsonWebTypeReader;
import GeneralFiles.BasePage;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class MainSteps {

    @And("^\"([^\"]*)\" tiklanir")
    public  void clickElement(String jsonParameterName){
        By locator= JsonWebTypeReader.getLocator(jsonParameterName);
        BasePage basePage=new BasePage();
        basePage.clickElement(locator);

    }


}
