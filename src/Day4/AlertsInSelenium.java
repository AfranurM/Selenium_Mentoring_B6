package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AlertsInSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement alertButton = driver.findElement(By.cssSelector("button[onclick='alertbox()']"));
        alertButton.click();

        Thread.sleep(3000);

        String alertText = driver.switchTo().alert().getText();

        driver.switchTo().alert().accept();

        System.out.println("you successfully accepted the: " + alertText);

    }
}
