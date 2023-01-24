package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class proiect {

    public WebDriver driver;

    @Test
    public void MetodaTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.emag.ro/");

        WebElement Laptop = driver.findElement(By.xpath("//a[@class='js-megamenu-list-department-link gtm_31vgamc']"));
        Laptop.click();

        WebElement LaptopSiAccesorii = driver.findElement(By.xpath("//a[@href='/laptopuri-accesorii/sd?tree_ref=2&ref=dep_cat_tree_15']"));
        LaptopSiAccesorii.click();

        WebElement Laptopuri = driver.findElement(By.xpath("//a[@href='/laptopuri/c?tree_ref=2172&ref=cat_tree_91']"));
        Laptopuri.click();

        WebElement Asus = driver.findElement(By.xpath("//a[@href='https://www.emag.ro/laptopuri/brand/asus/c?ref=lst_leftbar_8354_18']"));
        Asus.click();

        WebElement LaptopAsus = driver.findElement(By.xpath("//img[@src='https://s13emagst.akamaized.net/products/41052/41051334/images/res_e4ba64a09195aa22708136be199d5210.jpg?width=720&height=720&hash=3E79E6E4107A1729547142B1ED492D17']"));
        LaptopAsus.click();

        WebElement AdaugaInCos = driver.findElement(By.xpath("//button[@class='btn btn-xl btn-primary btn-emag btn-block main-button gtm_680klw yeahIWantThisProduct']"));
        AdaugaInCos.click();

        WebElement Cos = driver.findElement(By.xpath("//span[@class='visible-lg-inline visible-xl-inline']"));
        Cos.click();

        WebElement Continua = driver.findElement(By.xpath("//div[@class='emg-btn-icon emg-btn-icon-large']"));
        Continua.click();

    }

}
