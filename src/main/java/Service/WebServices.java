package Service;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebServices {
    public void openBrowserToVisitWebsite() throws InterruptedException {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");
        Thread.sleep(5000);
        chromeDriver.close();
    }
}
