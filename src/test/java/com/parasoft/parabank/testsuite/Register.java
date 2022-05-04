package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.pages.RegisterTest;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Register extends TestBase {
    LoginPage homePage = new LoginPage();
    RegisterTest signUpPage = new RegisterTest();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.clickOnRegisterLink();
        String actualText = signUpPage.VerifySignUpText();
        String expectedText = "Signing up is easy!";
        assertEquals(actualText, expectedText, "Verify SignUp Text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        signUpPage.enterFirstName("Umi");
        signUpPage.enterLastname("Patel");
        signUpPage.enterAddress("14 Queen Road");
        signUpPage.enterCityName("London");
        signUpPage.enterStateName("England");
        signUpPage.enterZipCode("HA0234");
        signUpPage.enterPhoneNumber("07896566432");
        signUpPage.enterSnnNumber("1234");
        signUpPage.sendEmailToEmailIdField("umipatel@gmail.com");
        signUpPage.enterPassword("umi123");
        signUpPage.enterConfirmedPassword("umi123");
        signUpPage.clickOnRegisterButton();
        String actualText=signUpPage.verifyAccountCreatedSuccessfully();
        String expectedText="Your account was created successfully. You are now logged in.";
        assertEquals(actualText,expectedText,"account successfully created text");
    }

}
