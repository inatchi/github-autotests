import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public By loginButton = By.xpath("//a[@href='/login']");

    public LogInPage loginClick(){
        driver.findElement(loginButton).click();
        return new LogInPage(driver);
    }

}
