import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web-calculator.ru/");
        driver.manage().window().maximize();
        new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement webElement = driver.findElement(By.xpath("//input[@class='sc-AxiKw eSbheu simple-calc-result']"));
        WebElement webElement1 = driver.findElement(By.xpath("//button[text()='1']"));

        webElement1.click();
        String s1 = webElement.getText();
        String s2 = webElement.getAttribute("value");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println(s1.length());

        driver.quit();

    }
}
