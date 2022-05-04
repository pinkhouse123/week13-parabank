package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage=new HomePage();

    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {
        homePage.sendEmailToEmailIdFieldOnHomePage("umipatel@gmail.com");
        homePage.sendPasswordOnHomePage("umi123");
        homePage.clickOnLoginLink();
        String actualTitle=homePage.validateAccountOverView();
        String expectedTitle="Accounts Overview";
        Assert.assertEquals(actualTitle,expectedTitle,"Account overview Title Validation");
    }
    @Test
    public void verifyTheErrorMessage() {
        homePage.sendEmailToEmailIdFieldOnHomePage("umipatel@gmail.com");
        homePage.clickOnLoginLink();
        String actualMessage=homePage.validateErrorMessage();
        String expectedMessage="Please enter a username and password.";
        Assert.assertEquals(actualMessage,expectedMessage,"Login Error message Validation");
    }
    @Test
    public void userShouldLogOutSuccessfully() {
        homePage.sendEmailToEmailIdFieldOnHomePage("umipatel@gmail.com");
        homePage.sendPasswordOnHomePage("umi123");
        homePage.clickOnLoginLink();
        LoginPage.clickOnLogOutBtn();
        homePage.validateCustomerLoginText();
    }


}