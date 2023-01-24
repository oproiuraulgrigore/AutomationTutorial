package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareData {

    private WebDriver driver;

    //Folosim adnotarea de @before din TestNG


    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void Setup(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Index.html");

    }

    //Folosim @After ca sa inchidem

    @AfterMethod
    public  void Clear(){
        // Inchidem un browser se face cu driver.quit

        driver.quit();

        // Driver.quit inchide browserul cu oricate tab-uri deschide
        // Close inchide doar tab-ul curent

    }



}
