package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ThirdPartOdTheSatPro {

//    SCENARIO 3:
//            -Navigate to "https://shopdemo.e-junkie.com/" website
//-Click on 'Add to Cart' for 'Demo eBook'
//            -Click on 'Pay using Debit Card'
//            -Click on 'Pay' button without filling any information
//-Validate "Invalid Email - Invalid Email - Invalid Billing Name" message is displayed!

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCartEBook = driver.findElement(By.xpath("(//button[text()=' Add To Cart'])[2]"));
        addToCartEBook.click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe);

        WebElement payDebitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        wait.until(ExpectedConditions.visibilityOf(payDebitCard));
        payDebitCard.click();

        WebElement payButton = driver.findElement(By.cssSelector("button[class='Pay-Button']"));
        wait.until(ExpectedConditions.invisibilityOf(payDebitCard));
        payButton.click();

        WebElement invalid = driver.findElement(By.cssSelector("#SnackBar>span"));
        String invalidText = invalid.getText();

        if(invalidText.contains("Invalid Email")&&invalidText.contains("Invalid Email")&&invalidText.contains("Invalid Billing Name"))
            System.out.println("you got the \"" + invalidText + "\" message" );

        else
            System.out.println("your text does not matching with " + invalidText);

    }

}
