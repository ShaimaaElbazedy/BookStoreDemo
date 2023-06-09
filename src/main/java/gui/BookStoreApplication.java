package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplication {
    //Variables
    private WebDriver driver;

    //Constructor
    public BookStoreApplication(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    public By loginButton(){
        return By.id("login");
    }

    //Operations
    public LoginScreen clickOnBookStoreCard(){
        driver.findElement(loginButton()).click();
        return new LoginScreen(driver);
    }

}
