package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebCalculatorHomePagePF {
    private static final String HOMEPAGE_URL = "https://web-calculator.ru/";
    private WebDriver driver;
    @FindBy(xpath = "//input[@class='sc-AxiKw eSbheu simple-calc-result']")
    private WebElement display;

    @FindBy(xpath = "//button[text()='1']")
    private WebElement buttonOne;

    @FindBy(xpath = "//button[text()='2']")
    private WebElement buttonTwo;

    @FindBy(xpath = "//button[text()='3']")
    private WebElement buttonThree;

    @FindBy(xpath = "//button[text()='4']")
    private WebElement buttonFour;

    @FindBy(xpath = "//button[text()='5']")
    private WebElement buttonFive;

    @FindBy(xpath = "//button[text()='6']")
    private WebElement buttonSix;

    @FindBy(xpath = "//button[text()='7']")
    private WebElement buttonSeven;

    @FindBy(xpath = "//button[text()='8']")
    private WebElement buttonEight;

    @FindBy(xpath = "//button[text()='9']")
    private WebElement buttonNine;

    @FindBy(xpath = "//button[text()='0']")
    private WebElement buttonZero;

    @FindBy(xpath = "//button[text()='00']")
    private WebElement buttonDoubleZero;

    @FindBy(xpath = "//button[text()=',']")
    private WebElement buttonDecimalPoint;

    @FindBy(xpath = "//button[text()='+']")
    private WebElement buttonPlus;

    @FindBy(xpath = "//button[text()='-']")
    private WebElement buttonMinus;

    @FindBy(xpath = "//button[text()='×']")
    private WebElement buttonMultiply;

    @FindBy(xpath = "//button[text()='/']")
    private WebElement buttonDivide;

    @FindBy(xpath = "//button[text()='=']")
    private WebElement buttonEqual;

    @FindBy(xpath = "//button[text()='√']")
    private WebElement buttonSqrt;

    @FindBy(xpath = "//button[text()='+/-']")
    private WebElement buttonPlusMinus;

    @FindBy(xpath = "//button[text()='←']")
    private WebElement buttonDelete;

    @FindBy(xpath = "//button[text()='%']")
    private WebElement buttonPercent;

    @FindBy(xpath = "//button[text()='C']")
    private WebElement buttonClean;

    @FindBy(xpath = "//button[text()='AC']")
    private WebElement buttonAllClean;

    @FindBy(xpath = "//button[text()='MC']")
    private WebElement buttonMemoryClean;

    @FindBy(xpath = "//button[text()='MR']")
    private WebElement buttonMemoryRead;

    @FindBy(xpath = "//button[text()='M-']")
    private WebElement buttonMemoryMinus;

    @FindBy(xpath = "//button[text()='M+']")
    private WebElement buttonMemoryPlus;

    public WebCalculatorHomePagePF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebCalculatorHomePagePF openPage(){
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        return this;
    }

    public String getInfoFromTheDisplay(){
        return display.getAttribute("value");
    }

    public WebCalculatorHomePagePF clickButtonOne(){
        (buttonOne).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonTwo(){
        (buttonTwo).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonThree(){
        (buttonThree).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonFour(){
        (buttonFour).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonFive(){
        (buttonFive).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonSix(){
        (buttonSix).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonSeven(){
        (buttonSeven).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonEight(){
        (buttonEight).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonNine(){
        (buttonNine).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonZero(){
        (buttonZero).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonDoubleZero(){
        (buttonDoubleZero).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonDecimalPoint(){
        (buttonDecimalPoint).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonPlus(){
        (buttonPlus).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonMinus(){
        (buttonMinus).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonMultiply(){
        (buttonMultiply).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonDivide(){
        (buttonDivide).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonEqual(){
        (buttonEqual).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonSqrt(){
        (buttonSqrt).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonPlusMinus(){
        (buttonPlusMinus).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonDelete(){
        (buttonDelete).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonPercent(){
        (buttonPercent).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonClean(){
        (buttonClean).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonAllClean(){
        (buttonAllClean).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonMemoryClean(){
        (buttonMemoryClean).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonMemoryRead(){
        (buttonMemoryRead).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonMemoryMinus(){
        (buttonMemoryMinus).click();
        return this;
    }

    public WebCalculatorHomePagePF clickButtonMemoryPlus(){
        (buttonMemoryPlus).click();
        return this;
    }

}
