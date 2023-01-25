package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import page.WebCalculatorHomePagePF;

import java.time.Duration;

public class WebCalculatorCleanButtonsTest {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void browserOpen(){
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        new WebCalculatorHomePagePF(driver).openPage();
    }

    @Test
    public void checkButtonCleanFirst(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonSix()
                .clickButtonSeven()
                .clickButtonClean()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "0");
    }

    @Test
    public void checkButtonCleanSecond(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonTwo()
                .clickButtonFour()
                .clickButtonZero()
                .clickButtonOne()
                .clickButtonSix()
                .clickButtonFive()
                .clickButtonDoubleZero()
                .clickButtonNine()
                .clickButtonClean()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "0");
    }

    @Test
    public void checkButtonCleanThird(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonTwo()
                .clickButtonOne()
                .clickButtonDoubleZero()
                .clickButtonFour()
                .clickButtonNine()
                .clickButtonZero()
                .clickButtonFive()
                .clickButtonClean()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "0");
    }

    @Test
    public void checkButtonAllCleanFerst(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonOne()
                .clickButtonDoubleZero()
                .clickButtonNine()
                .clickButtonFour()
                .clickButtonTwo()
                .clickButtonFive()
                .clickButtonZero()
                .clickButtonAllClean()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "0");
    }

    @Test
    public void checkButtonAllCleanSecond(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonSix()
                .clickButtonZero()
                .clickButtonTwo()
                .clickButtonNine()
                .clickButtonSeven()
                .clickButtonDoubleZero()
                .clickButtonOne()
                .clickButtonAllClean()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "0");
    }

    @Test
    public void checkButtonAllCleanThird(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonNine()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonFive()
                .clickButtonTwo()
                .clickButtonTwo()
                .clickButtonOne()
                .clickButtonFour()
                .clickButtonFive()
                .clickButtonAllClean()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "0");
    }

    @AfterClass(alwaysRun = true)
    public void browserQuit(){
        driver.quit();
        driver = null;
    }
}
