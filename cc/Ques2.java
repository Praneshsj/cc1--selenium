//package cc;
//
////import org.openqa.selenium.By;
////import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Ques2 {
//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver;
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--remote-allow-orgins=*");
//		driver=new ChromeDriver(co);
//		driver.get("https://www.saucedemo.com/");
//		
//		
//	}
//
//
//}
package cc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Ques2 {
public static void main( String[] args ) throws InterruptedException
{
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.saucedemo.com/");
driver.manage().window().maximize();
WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
txtBoxl.sendKeys("standard_user");
WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
txtBox2.sendKeys("secret_sauce");
driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
String txt1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
System.out.println(txt1);
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
String txt2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
System.out.println(txt2);
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
String txt3=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
System.out.println(txt3);
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
String txt4=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
System.out.println(txt4);
Thread.sleep(5000); 
}
}
