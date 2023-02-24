package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMore;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/a")
    private WebElement fundamentalsReadMore;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a" )
    private WebElement questionsButton;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
    private WebElement seleniumReadMore;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[2]/img")
    private WebElement imageSelenium;
    @FindBy(xpath = "/html/body/section[6]/div/h2")
    private WebElement frequentlyAskedQuestions;




    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setFrequentlyAskedQuestion() {
        this.frequentlyAskedQuestions.click();
    }
    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void clickOnReadMoreSelenium() {
        this.seleniumReadMore.click();
    }
    public void clickOnVirtualReadMore(){
        this.virtualReadMore.click();
    }

    public void clickOnFundamentalsReadMore(){
        this.fundamentalsReadMore.click();
    }

    public void clickQuestions(){
        this.questionsButton.click();
    }

    public void writeEmailToEmailField(String email){
        this.emailField.sendKeys(email);
    }

    public WebElement getEmailField() {
        return this.emailField;
    }

    public WebElement getImageCss() {
        return this.imageSelenium;
    }
}