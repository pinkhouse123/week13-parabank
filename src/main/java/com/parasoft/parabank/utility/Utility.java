package com.parasoft.parabank.utility;

import com.parasoft.parabank.driverfactory.ManageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends ManageDriver {

    /**
     * This method will click on element
     */
    public static void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //*******************Alert method********************//

    /**
     * This method will switch the alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * This method will accept the alert
     */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    //**********************Select class methods**************//

    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void clickOnRegisterLink() {
    }

    }

