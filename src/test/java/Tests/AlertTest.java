package Tests;

import ShareData.ShareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AlertTest extends ShareData {

    public WebDriver driver;

    @Test
    public void MetodaTest() {


        WebElement SkipSignIn = driver.findElement(By.id("btn2"));
        SkipSignIn.click();

        WebElement SwitchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        //Mergem cu mouse-ul pe un anumit element
        Actions actions = new Actions(driver);
        actions.moveToElement(SwitchTo).perform();

        WebElement AlertElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        AlertElement.click();

        //Navigam catre un URL
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        AlertOptions.get(0).click();

        WebElement AlertOk = driver.findElement(By.cssSelector("#OKTab>button"));
        AlertOk.click();

        //Interactionam cu o alerta
        Alert FirstAlert = driver.switchTo().alert();
        FirstAlert.accept();

        AlertOptions.get(1).click();

        WebElement AlertOkCancel = driver.findElement(By.cssSelector("#CancelTab>button"));
        AlertOkCancel.click();

        Alert SecondAlert = driver.switchTo().alert();
        SecondAlert.dismiss();

        AlertOptions.get(2).click();

        WebElement AlertText = driver.findElement(By.cssSelector("#Textbox>button"));
        AlertText.click();

        Alert ThirdAlert = driver.switchTo().alert();
        ThirdAlert.sendKeys("Bau");
        ThirdAlert.accept();

    }
}