package testcase;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.ReadXLSdata;


public class AddCart extends BaseTest{
   @Test()
    public static void CartTest() throws InterruptedException {
        //Login Functionalities Test Case
        driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath(loc.getProperty("proceed_button"))).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath(loc.getProperty("filter"))).click();
        driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
        Thread.sleep(1000);
        // driver.findElement(By.xpath(loc.getProperty("dropdown"))).click();
        driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//*[@id=\"item_3_title_link\"]"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(1000);
        // Remove 1 item
        driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
        Thread.sleep(1000);
    }
    }
