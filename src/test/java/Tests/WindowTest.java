package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {

    public WebDriver driver;

    @Test
    public void MetodaTest(){


        WebElement SkipSignIn = driver.findElement(By.id("btn2"));
        SkipSignIn.click();

        WebElement SwitchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        //Mergem cu mouse-ul pe un anumit element
        Actions actions = new Actions(driver);
        actions.moveToElement(SwitchTo).perform();

        WebElement WindowElement = driver.findElement(By.xpath("//a[text()='Windows']"));
        WindowElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");

        List<WebElement> WindowOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        WindowOptions.get(0).click();

        WebElement TabButton = driver.findElement(By.cssSelector("#Tabbed>a>button"));
        TabButton.click();

        //Identificam multimea de taburi/pagini

        List<String>Tabs = new ArrayList<>(driver.getWindowHandles());

        //Ne mutam cu focusul pe un tab specific

        driver.switchTo().window(Tabs.get(1));

        //Inchidem Tab-ul curent
        driver.close();
        driver.switchTo().window(Tabs.get(0));

        WindowOptions.get(1).click();
        WebElement WindowButton = driver.findElement(By.cssSelector("#Seperate>button"));
        WindowButton.click();

        List<String>Window = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Window.get(1));
        driver.close();
        driver.switchTo().window(Window.get(0));


        WindowOptions.get(2).click();
        WebElement MultipleButton = driver.findElement(By.cssSelector("#Multiple>button"));
        MultipleButton.click();
        List<String>Multiple = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Multiple.get(2));
        driver.close();
        driver.switchTo().window(Multiple.get(1));
        driver.close();
        driver.switchTo().window(Multiple.get(0));










    }
}
