package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.font.TextHitInfo;

public class MainPageTest {
    public static WebDriver driver;
    @Test
    public void openPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","" +
                "/home/vinay/Desktop/Desktop/MiFlashSaleBuy/src/main/java/org/example" +
                "/untitled/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://mobile.mi.com/in/search/searchpage/");
        driver.manage().window().maximize();

        WebElement SearchBTn = driver.findElement(By.xpath("//div[@class='searchbar-input']" +
                "//input[@placeholder='Search products']"));
        //SearchBTn.sendKeys("redmi note 9 pro max");
        SearchBTn.sendKeys("redmi 8 pro");
        //Thread.sleep(2000);
        SearchBTn.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver,100);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
      //  WebElement mobileBtn =driver.findElement(By.xpath("//p[@class='searchresult-item-name' and text()='Redmi Note 9 Pro Max Glacier White 6GB+128GB']"));
       //WebElement RedmiNote9Btn = driver.findElement(By.xpath("//section[@class='searchresult-item']//a[@href='http://m.store.mi.com/in/item/3201100005']"));
        //js.executeScript("arguments[0].scrollIntoView();", RedmiNote9Btn);

        WebElement Redmi8Btn = driver.findElement(By.xpath("//section[@class='searchresult-item']//a[@href='http://m.store.mi.com/in/item/3194100033']"));
        js.executeScript("arguments[0].scrollIntoView();", Redmi8Btn);


       //Thread.sleep(1000);
       //RedmiNote9Btn.click();
        Redmi8Btn.click();
        //Thread.sleep(2000);
        WebElement BuynowBtn = driver.findElement(By.xpath("//button[@class='" +
                "footer__btn footer__submit footer__submit--main' and text()='Buy Now']"));

        js1.executeScript("arguments[0].scrollIntoView();",BuynowBtn);
        //Thread.sleep(2000);
        BuynowBtn.click();
        //Thread.sleep(2000);

        //WebElement selectVarient =driver.findElement(By.xpath("//section[@class='root-product-panel__section sku-section']//ul[@class='sku-section__list']//button[@class='sku-section__button sku-section__button--sold-out']//span[text()='6GB+64GB']"));
       // js2.executeScript("arguments[0].scrollIntoView();",selectVarient);
        //Thread.sleep(2000);
       // selectVarient.click();

        WebElement selectVarient =driver.findElement(By.xpath("//section[@class='root-product-panel__section sku-section']//ul[@class='sku-section__list']//button[@class='sku-section__button']//span[text()='6GB+64GB']"));
        js2.executeScript("arguments[0].scrollIntoView();",selectVarient);
        Thread.sleep(2000);
        selectVarient.click();





        driver.findElement(By.xpath("//button[@class='" +
                "footer__btn footer__submit footer__submit--main' and text()='Buy Now']")).click();
        Thread.sleep(2000);
        WebElement gotoCart = driver.findElement(By.xpath("//div[@class='success-recommend__go-to-cart']//div[@class='go-to-cart__button' and text()='Go to Cart']"));
        js3.executeScript("arguments[0].scrollIntoView();",gotoCart);
        gotoCart.click();
        Thread.sleep(2000);






    }
}