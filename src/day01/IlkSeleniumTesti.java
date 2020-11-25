package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "/Users/apple/Documents/selenium labrires/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize(); // youtube yi açı ve sayfayı tam ekran yaptı
        driver.navigate().refresh();
        driver.navigate().to("http://denizates.net/");
        driver.navigate().back();
        //driver.close(); // sadece çalışılan sayfayı kapatır
        driver.quit();// bütün chrome leri kapatır



    }

}
