package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Documents/selenium labrires/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


        // Google anasayfasına gidelim. https://www.google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // Sayfa başlığının (title) "google" olduğunu doğrulayın. (verify)

        String actualResult = driver.getTitle();
        String expectedResult = "google";
        if (actualResult.equals(expectedResult)){
            System.out.println("Page title testi PASS");
        }else{
            System.out.println("Page title testi FAILED");
            System.out.println("Actual Page Title: " + actualResult);
        }
        Thread.sleep(5000);

        // 1.Navigate to youtube homepage https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
        //2.Verify if youtube homepage url is “www.youtube.com”
        String actualResult1 = driver.getCurrentUrl();
        String expectedResult1 = "www.youtube.com/";

        if (actualResult1.equals(expectedResult1)){
            System.out.println("Page URL testi PASS");
        }else{
            System.out.println("Page URL testi FAILED");
            System.out.println("Actual URL Title: " + actualResult1);
        }
        Thread.sleep(5000);

        driver.close();
    }
}
