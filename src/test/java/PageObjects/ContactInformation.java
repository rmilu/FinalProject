package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

    public ContactInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryField;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement countyField;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement courseOptionButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement courseOptionNextButton;
    public void writeEmailField(String emailField) {
        this.emailField.sendKeys(emailField);
    }
    public void writePhoneNumber(String phoneField) {
        this.phoneField.sendKeys(phoneField);
    }
    public void writeCountry(String countryField) {
        this.countryField.sendKeys(countryField);
    }
    public void writeCounty(String countyField) {
        this.countyField.sendKeys(countyField);
    }
    public void writePostCode(String postCode) {
        this.postCode.sendKeys(postCode);
    }
    public void clickNextButton() {
        this.nextButton.click();
    }
    public void clickCourseOption() {
        this.courseOptionButton.click();
    }

    public void clickCourseOptionNextButton() {
        this.courseOptionNextButton.click();
    }

}
