package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

// 1. Bir class oluşturun: LocatorsIntro
public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/apple/Documents/selenium labrires/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
       // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        //WebElement signInLink = driver.findElement(By.id("sign-in")); bu şekilde de sig in e tıklama yapıyor
        // WebElement signInLink = driver.findElement(By.className("data-test=\"sign-in")); Bunun ile sig in e tıklama yapmadı
        signInLink.click();


        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
            WebElement kullaniciAdi = driver.findElement(By.className("navbar-text"));
            if (kullaniciAdi.isDisplayed()){
                System.out.println("Kullanıcı Adı testtechproed@gmail.com PASS ");
            }else{
                System.out.println("Kullanıcı Adı testtechproed@gmail.com FAILED");
            }

            //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
            WebElement Addresses = driver.findElement(By.linkText("Addresses"));
            if (Addresses.isDisplayed()){
                System.out.println("address link appeared PASS");
            }else{
                System.out.println("address link appeared FAILED");
            }
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()){
            System.out.println("Sign Out link appeared PASS");
        }else{
            System.out.println("Sign Out link appeared FAILED");
        }

        // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada " + linkList.size() + "tane link var");
        driver.close();








    }
}
