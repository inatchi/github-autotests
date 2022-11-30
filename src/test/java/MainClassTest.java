import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainClassTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty("chromedriver","/opt/homebrew/bin");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://github.com/");
        //Adding wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Maximise browser window
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Test
    public void signInMethod(){
        LogInPage logInPage = mainPage.loginClick();
        String heading = logInPage.getHeading();
        Assert.assertEquals("Sign in to GitHub", heading);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
