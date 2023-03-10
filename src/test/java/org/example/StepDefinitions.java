package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        driver.getTitle();
    }
    @When("Click \"Read more\" on Learn to Fundamentals")
    public void clickOnFundamentalsReadMore() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnFundamentalsReadMore();
    }

    @Then("New page opens with Fundamentals header appears")
    public void newPageOpenFundamentals() {
        driver.getTitle();
    }

    @When("Click \"Questions\" on the header")
    public void clickQuestions() {
        mainPage.clickQuestions();
    }

    @Then("It goes to Frequently Asked Questions")
    public void frequentlyAskedQuestions() {
        Assert.assertEquals(mainPage.getFrequentlyAskedQuestions(), "Frequently Asked Questions");
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
        Assert.assertEquals("Selenium", driver.getCurrentUrl());
    }

    @When("Click facebook icon at John Doe profile")
    public void johnDoeProfile() {
        Utils.scrollToElement(driver, mainPage.getOurInstructors());
        mainPage.clickOnFacebookButton();
    }

    @Then("Facebook its opening")
    public void facebookPageOpens() {
        Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
    }

    @When("Click \"Start the Enrollment\" button")
    public void clickEnrollement(){
        mainPage.clickOnEnrollement();
    }

    @Then("Enrollment page opens")
    public void enrolementPageOpens(){
        Assert.assertEquals(mainPage.softwareTester(), "Software Testing");
    }

    @When("Go in the end of the page")
    public void goToEndOfThePage(){
       Utils.scrollToElement(driver, mainPage.getContactInfo());
    }
    @When("Click on the \"up\" icon")
    public void clickUpButton(){
        mainPage.clickUpButton();
    }

    @Then("I am sent at the beginning of the page")
    public void goingBeginingPage() {
        driver.get("file:///C:/Users/milur/Desktop/New%20folder/Testing-Env/index.html");
    }

    @When("Click on \"What You'll Learn\"")
    public void whatYouLearnClick() {
        mainPage.clickWhatYouLearn();
    }

    @Then("I am sent to Learn the Fundamentals")
    public void learnTheFundamentals() {
        Assert.assertEquals(mainPage.whatYouLearn(), "Learn The Fundamentals");
    }
    @After
    public void cleanUp() {
        driver.quit();
    }





}
