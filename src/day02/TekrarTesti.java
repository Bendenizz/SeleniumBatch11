package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını  doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa  doğru URL'yi yazdırın.

        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        5. Youtube sayfasina geri donun

        6. RefrSayfayi yenileyin

        7. Amazon sayfasina donun

        8. Sayfayi tamsayfa yapin

        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa     doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru  URL'yi yazdırın
        11.Sayfayi kapatin

         */
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Documents/selenium labrires/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        String actualResult = driver.getTitle();
        String expectedResult = "youtube";

        if (actualResult.equals(expectedResult)){
            System.out.println("Page title testi PASS");
        }else {
            System.out.println("Page title testi FAILED");
            System.out.println("Actual Page Title: " + actualResult);
        }
        Thread.sleep(2000);
        String actualURL = driver.getCurrentUrl();
        String arananKelime = "youtube";


        if (actualURL.contains(arananKelime) ){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED" + actualURL);
            System.out.println("URL " + arananKelime + " içermiyor");
        }
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String actualAmazon = driver.getTitle();
        String arananAmazon = "Amazon";

        if (actualAmazon.contains("Amazon")){
            System.out.println("PASS");

        }else{
            System.out.println("FAILED");
            System.out.println("URL " + arananAmazon + "içermiyor");

        }
        Thread.sleep(2000);
        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";

        if (actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("PASS");

        }else{
            System.out.println("FAILED");
            System.out.println("URL " + expectedAmazonURL);

        }
        Thread.sleep(2000);
        driver.close();




    }
}
