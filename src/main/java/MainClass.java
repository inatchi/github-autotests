
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("chromedriver","/opt/homebrew/bin");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://github.com/");
        //Adding wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Maximise browser window
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        LogInPage logInPage = new LogInPage(driver);

        mainPage.loginClick();
        logInPage.typeCredentials("vdfvfd", "fdbvhjfdbv");

    }
}
