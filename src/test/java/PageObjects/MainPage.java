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

    @FindBy(xpath = "/html/body/section[7]/div/h2")
    private WebElement ourInstructors;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/div/a[2]")
    private WebElement facebookButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrolementButton;

    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/h2")
    private WebElement contactInfo;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement upButton;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
    private WebElement whatYouLearn;

    @FindBy(xpath = "/html/body/div/div/h2/span")
    private WebElement softwareTester;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private WebElement learnTheFundamentals;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getFrequentlyAskedQuestions(){
        return this.frequentlyAskedQuestions.getText();
    }
    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void clickOnFacebookButton() {
        this.facebookButton.click();
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
    public void setFrequentlyAskedQuestions() {
        this.getFrequentlyAskedQuestions();
    }
    public void clickOnEnrollement() {
        this.enrolementButton.click();
    }

    public void clickUpButton() {
        this.upButton.click();
    }

    public void clickWhatYouLearn() {
        this.whatYouLearn.click();
    }

    public String whatYouLearn() {
        return this.learnTheFundamentals.getText();
    }

    public String softwareTester() {
        return this.softwareTester.getText();
    }
    public WebElement getEmailField() {
        return this.emailField;
    }

    public WebElement getImageCss() {
        return this.imageSelenium;
    }

    public WebElement getOurInstructors() {
        return this.ourInstructors;
    }
    public WebElement getContactInfo(){
        return this.contactInfo;
    }

}