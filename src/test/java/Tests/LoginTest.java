package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {


    @Test
    public void MetodaTest(){


        //Declaram elementul Sign In
        WebElement SignIn = getDriver().findElement(By.id("btn1"));
        SignIn.click();

        WebElement email = getDriver().findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "oproiuraul@gmail.com";
        email.sendKeys(emailValue);

        WebElement password = getDriver().findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordValue = "12345";
        password.sendKeys(passwordValue);

        WebElement Enter = getDriver().findElement(By.id("enterbtn"));
        Enter.click();

        //Validam un mesaj de eroare

        WebElement error = getDriver().findElement(By.id("errormsg"));
        String expectederror = "Invalid User Name or PassWord";
        String actualerror = error.getText();

        Assert.assertEquals(actualerror,expectederror,"Eroarea de la login nu este corecta");


    }

}
