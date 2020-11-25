package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Documents/selenium labrires/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // youtube ana sayfasına gidelim
        driver.navigate().to("https://www.youtube.com/");

        // amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com");

        //btekrar youtube sayfasına dön
        driver.navigate().back();

        // yeniden amazona git
        driver.navigate().forward();

        // sayfayı refreash yap
        driver.navigate().refresh();

        // sayfayı tam ekran yap
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
    }
}
