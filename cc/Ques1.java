//
package cc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ques1 {
public static void main(String args[]) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new FirefoxDriver();

driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    String cart = driver.findElement(By.className("shopping_cart_badge")).getText();
    if(cart.equals("1")) {
    System.out.println("The product was added to the cart");
    };
driver.findElement(By.cssSelector(".shopping_cart_link")).click();
String pageTitle = driver.findElement(By.cssSelector(".title")).getText();
if(pageTitle.equals("Your Cart"))
System.out.println("The cart contents can be viewed");
driver.findElement(By.id("checkout")).click();
pageTitle = driver.findElement(By.className("title")).getText();
if(pageTitle.contains("Your Information")) {
System.out.println("The checkout page is displayed");
}
driver.findElement(By.id("first-name")).sendKeys("PRANESH");
    driver.findElement(By.id("last-name")).sendKeys("SJ");
    driver.findElement(By.id("postal-code")).sendKeys("9876589");
    driver.findElement(By.id("continue")).click();
    if(driver.findElement(By.className("title")).getText().contains("Overview")) {
    System.out.println("The Overview is Displayed");
    }
    String productName = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
    String productPrice = driver.findElement(By.cssSelector(".inventory_item_price")).getText();
    System.out.println("Product name: " + productName);
    System.out.println("Product price: " + productPrice);
    if(driver.getTitle().equals("Swag Labs"))System.out.println("The title is verified");
    if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) System.out.println("The URL is verified");  
}
}
