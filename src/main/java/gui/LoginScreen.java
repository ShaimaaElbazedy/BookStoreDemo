package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginScreen {
    //Variables
    WebDriver driver;

    //Constructor
    public LoginScreen(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    public By usernameField(){
        return By.id("userName");
    }
    public By passwordField(){
        return By.id("password");
    }
    public By loginButton(){
        return By.id("login");
    }

    //Operations
    public void typeUsername(String username){
        driver.findElement(usernameField()).sendKeys(username + Keys.ENTER);
    }
    public void typePassword(String paswword){
        driver.findElement(usernameField()).sendKeys(paswword + Keys.ENTER);
    }
    public BookStoreLanding clickOnLoginButton(){
        driver.findElement(loginButton()).click();
        return new BookStoreLanding(driver);
    }
}
