package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "inputUsername")
    private WebElement username;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public void setUsername(String user){
        username.sendKeys(user);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLogin( ){
        loginButton.click();
    }

    public boolean isDisplayed(){
        username.isDisplayed();
        return true;
    }
}