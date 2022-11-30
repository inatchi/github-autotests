import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;
    public LogInPage(WebDriver driver){
        this.driver = driver;
    }
    private By loginInput = By.xpath("//input[@id='login_field']");
    private By passwordInput = By.xpath("//input[@id='password']");
    private By submitButton = By.xpath("//input[@value='Sign in']");
    public By errorMessage = By.xpath("//div[@role='alert']");
    public By headingText = By.xpath("//h1");

    public LogInPage typeCredentials(String login, String password){
        driver.findElement(loginInput).sendKeys(login);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(submitButton).click();
        return this;
    }

    public String getErrorText(){
        return driver.findElement(errorMessage).getText();
    }

    public String getHeading(){
        return driver.findElement(headingText).getText();
    }
}
