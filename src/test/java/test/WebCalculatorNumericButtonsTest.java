package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.WebCalculatorHomePagePF;
import java.time.Duration;

public class WebCalculatorNumericButtonsTest {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserOpen(){
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void checkTitle(){
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Калькулятор онлайн – точный и бесплатный | Простой калькулятор");
    }

    @Test
    public void checkNumericButtonsDirectSequence(){
       String valueOnDisplay = new WebCalculatorHomePagePF(driver)
               .openPage()
               .clickButtonOne()
               .clickButtonTwo()
               .clickButtonThree()
               .clickButtonFour()
               .clickButtonFive()
               .clickButtonSix()
               .clickButtonSeven()
               .clickButtonEight()
               .clickButtonNine()
               .clickButtonZero()
               .clickButtonDoubleZero()
               .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "123456789000");
    }

    @Test
    public void checkNumericButtonsRandomSequence(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .openPage()
                .clickButtonTwo()
                .clickButtonFour()
                .clickButtonZero()
                .clickButtonOne()
                .clickButtonSix()
                .clickButtonThree()
                .clickButtonEight()
                .clickButtonFive()
                .clickButtonSeven()
                .clickButtonDoubleZero()
                .clickButtonNine()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "240163857009");
    }

    @Test
    public void checkNumericButtonsReversSequence(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .openPage()
                .clickButtonDoubleZero()
                .clickButtonZero()
                .clickButtonNine()
                .clickButtonEight()
                .clickButtonSeven()
                .clickButtonSix()
                .clickButtonFive()
                .clickButtonFour()
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonOne()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "987654321");
    }

    @AfterMethod(alwaysRun = true)
    public void browserQuit(){
        driver.quit();
        driver = null;
    }
}
