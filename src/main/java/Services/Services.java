package Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Services {
    WebDriver driver;
    String url="https://automationexercise.com/";
    String loginLink="//ul/li[4]/a/i";
    public void registerUser() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.className("logo"));
        Thread.sleep(5000);
        if (logo !=null){
            System.out.println("Page loaded sucessfully");
        }else {
            System.out.println("Page is not loaded sucessfully");
        }
        driver.findElement(By.xpath(loginLink)).click();

        Thread.sleep(5000);
        driver.close();

    }
}
