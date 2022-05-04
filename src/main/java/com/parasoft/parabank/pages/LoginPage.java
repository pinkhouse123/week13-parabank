package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By logOut=By.xpath("//div[@id='leftPanel']/ul/li[8]/a");

    public static void clickOnLogOutBtn() {
    }


    public void clickOnLoginButton(){
        clickOnElement(logOut);
    }

}