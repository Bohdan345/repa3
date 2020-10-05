package WebDriverInit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;

import static WebDriverInit.Data.DRIVER_PATH;

public class initDriver {


    private static initDriver instanceDriver = null;
    private WebDriver driver;

    public initDriver() {

    }


    public WebDriver openBrowser() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Project\\Trainee_Project\\chromedriver.exe");
//        driver = new ChromeDriver();
//        return driver;

        switch (DRIVER_PATH) {
            case "CH ": {
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
            }
            case "FF": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }

    public static initDriver getInstance() {

        if (instanceDriver == null)
            instanceDriver = new initDriver();
        return instanceDriver;

    }

}
