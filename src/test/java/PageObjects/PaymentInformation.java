package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformation {
    public PaymentInformation(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderName;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumber;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvc;
@FindBy(xpath = "//*[@id=\"month\"]")
private WebElement month;
@FindBy(xpath = "//*[@id=\"year\"]")
private WebElement year;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
private WebElement next;
@FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[1]/label")
private WebElement expiryDate;
public void writeCardHolderName(String cardHolder) {
    this.cardHolderName.sendKeys(cardHolder);
}
public void writeCardNumber(String cardNumber) {
    this.cardNumber.sendKeys(cardNumber);
}
public void writeCVC(String cvc) {
    this.cvc.sendKeys(cvc);
}
public void clickMonth() {
    this.month.click();
    }
public void clickYear() {
    this.year.click();
}
public void clickNext() {
    this.next.click();
}
public void clickExpiryDate() {
    this.expiryDate.click();
}
}
