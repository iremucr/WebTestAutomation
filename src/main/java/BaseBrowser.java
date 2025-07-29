import org.openqa.selenium.WebDriver;

public interface BaseBrowser {

    WebDriver  runLocal();
    WebDriver runRemote(String url);

}
