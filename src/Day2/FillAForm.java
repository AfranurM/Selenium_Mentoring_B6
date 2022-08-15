package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FillAForm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        firstNameInput.sendKeys("Anthony");

        WebElement lastNameInput = driver.findElement(By.name("lastname"));
        lastNameInput.sendKeys("Spot");

        WebElement femaleCheckBox = driver.findElement(By.cssSelector("input[value='Female']"));
        femaleCheckBox.click();

        WebElement oneYearExperienceCb = driver.findElement(By.cssSelector("input[value='1']"));
        oneYearExperienceCb.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

        WebElement dateInput = driver.findElement(By.cssSelector("tr:nth-child(5)>td:nth-child(2)>input"));
        dateInput.sendKeys("01/18/2022");

        WebElement professionCheckBox = driver.findElement(By.cssSelector("input[value='Automation Tester']"));
        professionCheckBox.click();

        WebElement photoInput = driver.findElement(By.name("photo"));
        photoInput.sendKeys("/Users/afranurmenemenli/Desktop/selenium-logo.png");
























    }
}
