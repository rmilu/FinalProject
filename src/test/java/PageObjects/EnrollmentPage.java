package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {
public EnrollmentPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;

@FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

@FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement username;

@FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement password;

@FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;

@FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
private WebElement nextButton;

@FindBy(xpath = "/html/body/div/div/h2/span")
private WebElement softwareTesting;

@FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
private WebElement contactInformation;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/div")
private WebElement errorMessage;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
private WebElement success;

public void writeFirstName(String name) {
    this.firstName.sendKeys(name);
}
public void writeLastName(String lastName) {
    this.lastName.sendKeys(lastName);
}
public void writeUsername(String username) {
    this.username.sendKeys(username);
}
public void writePassword(String password) {
    this.password.sendKeys(password);
}
public void writeConfirmPassword(String confirmPassword) {
    this.confirmPassword.sendKeys(confirmPassword);
}
public void clickNextButton() {
    this.nextButton.click();
}
public WebElement getErrorMessage() {
    return this.errorMessage;
}
public String itsSuccess() {
    return this.success.getText();
}

}
