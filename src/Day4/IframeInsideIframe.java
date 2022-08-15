package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class IframeInsideIframe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement iframeButton = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        wait.until(ExpectedConditions.elementToBeClickable(iframeButton));
        iframeButton.click();

        WebElement firstIframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(firstIframe);

        WebElement secondIframe = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
        driver.switchTo().frame(secondIframe);

        WebElement inputBox = driver.findElement(By.tagName("input"));
        inputBox.sendKeys("trial 2");

    }
}
