package Tests;

import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends ShareData {
    public WebDriver driver;

    @Test
    public void MetodaTest() throws  InterruptedException{

        driver = null;

        WebElement SkipSignIn = getDriver().findElement(By.id("btn2"));
        SkipSignIn.click();

        WebElement FirstName = getDriver().findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstNameValue = "Raul";
        FirstName.sendKeys(firstNameValue);

        WebElement LastName = getDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String LastNameValue = "Oproiu";
        LastName.sendKeys(LastNameValue);

        WebElement Adress = getDriver().findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String AdressValue = "Strada";
        Adress.sendKeys(AdressValue);

        WebElement Email = getDriver().findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        String EmailValue = "oproiuraul@yahoo.com";
        Email.sendKeys(EmailValue);


        WebElement Phone = getDriver().findElement(By.xpath(" //input[@ng-model='Phone']"));
        String PhoneValue = "0742526133";
        Phone.sendKeys(PhoneValue);

        WebElement Gen = getDriver().findElement(By.xpath("//input[@value='Male']"));
        Gen.click();

        WebElement Hobby = getDriver().findElement(By.id("checkbox2"));
        Hobby.click();

        //Interactionam cu un dropdown clasic

        WebElement Skills = getDriver().findElement(By.id("Skills"));
        Select skillsDropdown = new Select(Skills);
        skillsDropdown.selectByVisibleText("Java");


        WebElement Year = getDriver().findElement(By.id("yearbox"));
        Select yearDropdown = new Select(Year);
        yearDropdown.selectByValue("1996");


        WebElement Month = getDriver().findElement(By.xpath("//select[@ng-model='monthbox']"));
        Select monthDropdown = new Select(Month);
        monthDropdown.selectByVisibleText("August");


        WebElement Day = getDriver().findElement(By.id("daybox"));
        Select dayDropdown = new Select(Day);
        dayDropdown.selectByValue("18");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript ("window.scrollBy(0,300)");

        WebElement LanguageElement = getDriver().findElement(By.id("msdd"));
        LanguageElement.click();

        // Ineractionam cu o multime de elemente ( drop-down )

        List<WebElement>LanguageOptions = getDriver().findElements(By.cssSelector(".ui-autocomplete>li>a"));
        String ExpectedLanguage = "English";
        for (int index = 0; index < LanguageOptions.size(); index++){
            if (LanguageOptions.get(index).getText().equals(ExpectedLanguage)){
                LanguageOptions.get(index).click();
            }
        }
        Gen.click();

        WebElement SelectCountry = getDriver().findElement(By.cssSelector(".select2-selection"));
        SelectCountry.click();

        WebElement SelectCountryInput = getDriver().findElement(By.cssSelector(".select2-search__field"));
        SelectCountryInput.sendKeys("Australia");
        SelectCountryInput.sendKeys(Keys.ENTER);

        WebElement SelectYear = getDriver().findElement(By.cssSelector(".ng-touched"));
        SelectYear.click();

        List<WebElement>SelectYearInput = getDriver().findElements(By.cssSelector(".ng-valid-required"));
        Integer ExpectYear = 1996;
        for (int index = 0; index < SelectYearInput.size(); index++){
            if (SelectYearInput.get(index).getText().equals(ExpectYear)){
                SelectYearInput.get(index).click();
            }
        }

        

    }
}
