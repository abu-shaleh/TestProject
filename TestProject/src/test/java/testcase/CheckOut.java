package testcase;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CheckOut extends BaseTest {
    @Test()
    public static void CheckoutTest() throws InterruptedException {
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
        // Adding items to cart
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
        // Checkout Functions
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Mr.");
        driver.findElement(By.id("last-name")).sendKeys("Test");
        driver.findElement(By.id("postal-code")).sendKeys("1207");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
        Thread.sleep(1000);
    }
}
