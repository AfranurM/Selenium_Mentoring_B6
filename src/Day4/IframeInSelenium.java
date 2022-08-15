package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframeInSelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement iframe = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(iframe);


        WebElement inputBox = driver.findElement(By.tagName("input"));
        inputBox.sendKeys("trial");

    }
}
