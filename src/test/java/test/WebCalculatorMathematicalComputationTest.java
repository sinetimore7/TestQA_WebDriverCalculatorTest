package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.WebCalculatorHomePagePF;

import java.time.Duration;

public class WebCalculatorMathematicalComputationTest {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void browserOpen(){
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        new WebCalculatorHomePagePF(driver).openPage();
    }



    @Test
    public void checkSumFirst(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonFive()
                .clickButtonPlus()
                .clickButtonTwo()
                .clickButtonEight()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "373");
    }



    @Test
    public void checkSumSecond(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonSeven()
                .clickButtonOne()
                .clickButtonNine()
                .clickButtonPlus()
                .clickButtonFive()
                .clickButtonFour()
                .clickButtonTwo()
                .clickButtonZero()
                .clickButtonNine()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "54928");
    }



    @Test
    public void checkSumThird(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonNine()
                .clickButtonSeven()
                .clickButtonEight()
                .clickButtonPlus()
                .clickButtonSeven()
                .clickButtonFive()
                .clickButtonNine()
                .clickButtonOne()
                .clickButtonDoubleZero()
                .clickButtonTwo()
                .clickButtonSix()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "76743004");
    }

    @Test
    public void checkSumFourth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonSeven()
                .clickButtonFive()
                .clickButtonPlus()
                .clickButtonNine()
                .clickButtonFour()
                .clickButtonZero()
                .clickButtonThree()
                .clickButtonFive()
                .clickButtonPlus()
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonNine()
                .clickButtonPlus()
                .clickButtonSeven()
                .clickButtonTwo()
                .clickButtonNine()
                .clickButtonOne()
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "823615");
    }

    @Test
    public void checkSumFifth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonFour()
                .clickButtonTwo()
                .clickButtonSix()
                .clickButtonFive()
                .clickButtonThree()
                .clickButtonPlusMinus()
                .clickButtonPlus()
                .clickButtonSix()
                .clickButtonZero()
                .clickButtonNine()
                .clickButtonDoubleZero()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "18247");
    }

    @Test
    public void checkSubtractionFirst(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonEight()
                .clickButtonMinus()
                .clickButtonFive()
                .clickButtonSeven()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "271");
    }

    @Test
    public void checkSubtractionSecond(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonFour()
                .clickButtonNine()
                .clickButtonTwo()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonMinus()
                .clickButtonOne()
                .clickButtonSeven()
                .clickButtonSix()
                .clickButtonThree()
                .clickButtonZero()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "31653");
    }

    @Test
    public void checkSubtractionThird(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonSeven()
                .clickButtonSix()
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonTwo()
                .clickButtonThree()
                .clickButtonSeven()
                .clickButtonMinus()
                .clickButtonTwo()
                .clickButtonEight()
                .clickButtonSeven()
                .clickButtonDoubleZero()
                .clickButtonFive()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "7347232");
    }

    @Test
    public void checkSubtractionFourth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonTwo()
                .clickButtonNine()
                .clickButtonThree()
                .clickButtonPlusMinus()
                .clickButtonMinus()
                .clickButtonFive()
                .clickButtonNine()
                .clickButtonZero()
                .clickButtonThree()
                .clickButtonEight()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "-93331");
    }

    @Test
    public void checkSubtractionFifth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonNine()
                .clickButtonTwo()
                .clickButtonEight()
                .clickButtonMinus()
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonFive()
                .clickButtonMinus()
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonFour()
                .clickButtonZero()
                .clickButtonNine()
                .clickButtonMinus()
                .clickButtonSeven()
                .clickButtonThree()
                .clickButtonDoubleZero()
                .clickButtonThree()
                .clickButtonOne()
                .clickButtonNine()
                .clickButtonEight()
                .clickButtonFour()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "-730087810");
    }


    @Test
    public void checkMultiplicationFirst(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonThree()
                .clickButtonMultiply()
                .clickButtonFive()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "15");
    }

    @Test
    public void checkMultiplicationSecond(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonTwo()
                .clickButtonPlusMinus()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonMultiply()
                .clickButtonOne()
                .clickButtonSeven()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "-4811");
    }
    @Test
    public void checkMultiplicationThird(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonNine()
                .clickButtonEight()
                .clickButtonMultiply()
                .clickButtonTwo()
                .clickButtonDoubleZero()
                .clickButtonThree()
                .clickButtonFive()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "114159430");
    }

    @Test
    public void checkMultiplicationFourth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonSeven()
                .clickButtonNine()
                .clickButtonEight()
                .clickButtonTwo()
                .clickButtonOne()
                .clickButtonMultiply()
                .clickButtonSeven()
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonNine()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "41627408109");
    }

    @Test
    public void checkMultiplicationFifth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonTwo()
                .clickButtonFour()
                .clickButtonMultiply()
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonMultiply()
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonFour()
                .clickButtonMultiply()
                .clickButtonSix()
                .clickButtonSeven()
                .clickButtonThree()
                .clickButtonNine()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "2919011328");
    }

    @Test
    public void checkDivisionFirst(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonOne()
                .clickButtonFive()
                .clickButtonDivide()
                .clickButtonThree()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "5");
    }

    @Test
    public void checkDivisionSecond(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonFour()
                .clickButtonEight()
                .clickButtonEight()
                .clickButtonEight()
                .clickButtonEight()
                .clickButtonDivide()
                .clickButtonFive()
                .clickButtonSix()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "873");
    }

    @Test
    public void checkDivisionThird(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonFour()
                .clickButtonTwo()
                .clickButtonNine()
                .clickButtonZero()
                .clickButtonFive()
                .clickButtonFive()
                .clickButtonZero()
                .clickButtonDivide()
                .clickButtonSix()
                .clickButtonThree()
                .clickButtonEight()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "6725");
    }

    @Test
    public void checkDivisionFourth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonThree()
                .clickButtonFive()
                .clickButtonSeven()
                .clickButtonSeven()
                .clickButtonZero()
                .clickButtonSeven()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonDecimalPoint()
                .clickButtonSeven()
                .clickButtonFive()
                .clickButtonDivide()
                .clickButtonFive()
                .clickButtonFour()
                .clickButtonThree()
                .clickButtonZero()
                .clickButtonOne()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "658.75");
    }

    @Test
    public void checkDivisionFifth(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonOne()
                .clickButtonOne()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonDoubleZero()
                .clickButtonZero()
                .clickButtonOne()
                .clickButtonZero()
                .clickButtonThree()
                .clickButtonOne()
                .clickButtonTwo()
                .clickButtonDivide()
                .clickButtonFive()
                .clickButtonOne()
                .clickButtonSeven()
                .clickButtonDivide()
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonDivide()
                .clickButtonNine()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "684.5");
    }

    @Test
    public void checkMathMixOne(){
        String valueOnDisplay = new WebCalculatorHomePagePF(driver)
                .clickButtonOne()
                .clickButtonOne()
                .clickButtonEight()
                .clickButtonThree()
                .clickButtonDoubleZero()
                .clickButtonZero()
                .clickButtonOne()
                .clickButtonZero()
                .clickButtonThree()
                .clickButtonOne()
                .clickButtonTwo()
                .clickButtonDivide()
                .clickButtonFive()
                .clickButtonOne()
                .clickButtonSeven()
                .clickButtonDivide()
                .clickButtonThree()
                .clickButtonFour()
                .clickButtonDivide()
                .clickButtonNine()
                .clickButtonThree()
                .clickButtonTwo()
                .clickButtonEqual()
                .getInfoFromTheDisplay();

        Assert.assertEquals(valueOnDisplay, "684.5");
    }


    @AfterMethod(alwaysRun = true)
    public void cleanDisplay(){
        new WebCalculatorHomePagePF(driver).clickButtonClean();
    }

    @AfterClass(alwaysRun = true)
    public void browserQuit(){
        driver.quit();
        driver = null;
    }
}
