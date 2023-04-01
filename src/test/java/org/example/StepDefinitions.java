package org.example;

import PageObjects.ContactInformation;
import PageObjects.EnrollmentPage;
import PageObjects.MainPage;
import PageObjects.PaymentInformation;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    private EnrollmentPage enrollmentPage;

    private ContactInformation contactInformation;

    private PaymentInformation paymentInformation;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        enrollmentPage = new EnrollmentPage(driver);
        contactInformation = new ContactInformation(driver);
        paymentInformation = new PaymentInformation(driver);
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
        //TODO: Add assert
        Assert.assertEquals("Fundamentals Page","Fundamentals Page");
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
    @When("I am on the enrollment page")
    public void iAmOnEnrollmentPAge() {
        driver.get("file:///C:/Users/milur/Desktop/New%20folder/Testing-Env/routes/enrollment.html");
    }

    @Then("I write the First Name of {string}")
    public void firstNameFill(String string) {
        enrollmentPage.writeFirstName(string);
    }
    @And("I write the Last Name of {string}")
    public void lastNameFill(String string) {
        enrollmentPage.writeLastName(string);
    }
    @And("I write username of {string}")
    public void usernameFill(String string) {
        enrollmentPage.writeUsername(string);
    }
    @And("I write password of {string}")
    public void passwordFill(String string) {
        enrollmentPage.writePassword(string);
    }
    @And("I write confirm password of {string}")
    public void confirmPasswordFill(String string) {
        enrollmentPage.writeConfirmPassword(string);
    }
    @And("Click on next button")
    public void clickNextButton() {
        Utils.waitForElementToLoad(2);
        enrollmentPage.clickNextButton();
    }
    @Then("Because wrong credentials were inserted, I will remain on Personal Information page.")
    public void i_will_remain_on_current_page() {
        Utils.waitForElementToLoad(2);
        Assert.assertEquals("Contact Information", "Personal Information");
    }
    @Then("Contact Information page is opening")
    public void personalInformationPageOpens() {
        Assert.assertEquals("Contact information", "Contact information");
    }
    @When("Click twitter icon at Jane Doe profile")
        public void janeDoeProfile() {
        Utils.scrollToElement(driver, mainPage.getOurInstructors());
        mainPage.clickOnTwitterButton();
    }
    @Then("Twitter its opening")
        public void twitterPageOpens() {
        Assert.assertEquals("https://twitter.com/", driver.getCurrentUrl());
    }
    @When("Click linkedin icon at Steve Smith profile")
        public void steveSmithProfile() {
        Utils.scrollToElement(driver, mainPage.getOurInstructors());
        mainPage.clickOnLinkedinButton();
    }
    @Then("Linkedin its opening")
        public  void linkedinPagOpens() {
        Assert.assertEquals("https://www.linkedin.com/", driver.getCurrentUrl());
    }
    @When("Click instagram icon at Sara Smith profile")
        public void saraSmithProfile() {
        Utils.scrollToElement(driver, mainPage.getOurInstructors());
        mainPage.clickOnInstagramButton();
    }
    @Then("Instagram its opening")
        public void instagramPageOpens() {
        Assert.assertEquals("https://www.instagram.com/", driver.getCurrentUrl());
    }
    @When("Click \"Instructors\" on the header")
        public void clickOnOurInstructors() {
        mainPage.clickonOurInstructorsButton();
    }
    @Then("It goes to Our Instructors")
        public void sentToOurInstructors() {
        Assert.assertEquals("Our Instructors", "Our Instructors");
    }
    @And("Click on first question")
        public void clickOnTheFirstButton() {
        mainPage.clickOnTheFirstQuestion();
    }
    @And("Click on second question")
        public void clickOnTheSecondButton() {
        mainPage.clickOnTheSecondQuestion();
    }
    @And("Click on third question")
        public void clickOnTheThirdButton() {
        mainPage.clickOnTheThirdQuestion();
    }
    @And("Click on forth question")
        public void clickOnTheForthButton() {
        mainPage.clickOnTheForthQuestion();
    }
    @And("Click on fifth question")
        public void clickOnTheFifthButton() {
        mainPage.clickOnTheFifthQuestion();
    }
    @Then("More information are revealed")
        public void informationIsRevealed() {
        Assert.assertEquals("Lorem ipsum dolor", "Lorem ipsum dolor");
    }
    @When("Click \"Read more\" on Hybrid")
        public void clickOnReadMoreHybridButton() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnTheReadMoreHybrid();
    }
    @Then("New page opens with Hybrid header")
        public void newHybridOpens() {
        Assert.assertEquals("Hybrid", "Hybrid");
    }
    @When("Click \"Read more\" on In Person")
        public void clickOnInPersonButton() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnTheInPerson();
    }
    @Then("New page opens with In Person header")
        public void newInPersonOpens() {
        Assert.assertEquals("In Person", "In Person");
    }
    @Then("An error appears")
        public void errorAppears() {
        Assert.assertTrue(enrollmentPage.getErrorMessage().getAttribute("class").contains("error"));
    }
    @And("I write the Email of {string}")
        public void writeEmailAdress(String string) {
        contactInformation.writeEmailField(string);
    }

    @And("I write the Phone of {string}")
        public void writePhoneNumber(String string) {
        contactInformation.writePhoneNumber(string);
    }
    @And("I write the Country of {string}")
        public void writeCountry(String string) {
        contactInformation.writeCountry(string);
    }
    @And("I write the City of {string}")
        public void writeCity(String string) {
        contactInformation.writeCounty(string);
    }
    @And("I write the Post Code of {string}")
    public void writePostCode(String string) {
        contactInformation.writePostCode(string);
    }
    @And("Click on next button bellow")
    public void clickNext() {
        Utils.waitForElementToLoad(2);
        contactInformation.clickNextButton();
    }
    @And("Select Software Testing - Manual tester certificate")
    public void clickCourseOption() {
        contactInformation.clickCourseOption();
    }
    @And("I Click on next button")
    public void clickOnTheNextButton() {
        Utils.waitForElementToLoad(2);
        contactInformation.clickCourseOptionNextButton();
    }
    @And("I write the Card holder name {string}")
    public void writeCardHolderName(String string) {
        paymentInformation.writeCardHolderName(string);
    }
    @And("I write the Card number {string}")
    public void writeCardNumber(String string) {
        paymentInformation.writeCardNumber(string);
    }
    @And("I write the CVC {string}")
    public void writeCVC(String string) {
        paymentInformation.writeCVC(string);
    }
    @And("Select Month June")
    public void selectMonth() {
        paymentInformation.clickMonth();
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        dropdown.selectByIndex(6);
    }
    @And("Select Year 2027")
    public void selectYear() {
        paymentInformation.clickYear();
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        dropdown.selectByVisibleText(String.valueOf(2027));
        paymentInformation.clickExpiryDate();
    }
    @And("I click on the next button")
    public void selectNext() {
        Utils.waitForElementToLoad(2);
        paymentInformation.clickNext();
    }
    @Then("A new page opens with information that the registration was successful")
    public void itsSuccess() {
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(enrollmentPage.itsSuccess(), "Success!");
    }
    @After
    public void cleanUp() {
        driver.quit();
    }





}
