package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("file:///C:/Users/milur/Desktop/New%20folder/Testing-Env/index.html");
    }

    @When("I write the email address of {string}")
    public void i_write_the_email_address_of(String string) {
        mainPage.writeEmailToEmailField(string);
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @Then("The confirmation pop-up appears")
    public void theConfirmationPopUpAppear() {
        driver.switchTo().alert().accept();
    }

    @When("Click \"Read more\" on Virtual")
    public void clickOnVirtualReadMore() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnVirtualReadMore();
    }
    @Then("New page opens with Virtual header")
    public void newPageOpenVirtual() {
        driver.get("file:///C:/Users/milur/Desktop/New%20folder/Testing-Env/routes/virtual.html");
    }
    @When("Click \"Read more\" on Learn to Fundamentals")
    public void clickOnFundamentalsReadMore() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnFundamentalsReadMore();
    }

    @Then("New page opens with Fundamentals header appears")
    public void newPageOpenFundamentals() {
        driver.get("file:///C:/Users/milur/Desktop/New%20folder/Testing-Env/routes/fundamentals.html");
    }

    @When("Click \"Questions\" on the header")
    public void clickQuestions() {
        mainPage.clickQuestions();
    }

    @Then("It goes to Frequently asked questions")
    public void frequentlyAskedQuestions(){
        mainPage.setFrequentlyAskedQuestion();
    }

    @Then("The field is coloured red")
    public void coloredRed() {
        Assert.assertTrue(mainPage.getEmailField().getAttribute("class").contains("error"));
    }

    @When("Click \"Read more\" on Learn Selenium tab")
    public void seleniumReadMore() {
        Utils.scrollToElement(driver, mainPage.getImageCss());
        mainPage.clickOnReadMoreSelenium();
    }

    @Then("New page opens with Selenium header")
    public void seleniumPageOpens() {
        Assert.assertEquals("Selemnium", driver.getTitle());
    }

    @When("Click facebook icon at John Doe profile")

    @Then("Facebook its opening")

    @After
    public void cleanUp() {
        driver.quit();
    }





}
