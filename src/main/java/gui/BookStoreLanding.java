package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreLanding {
    //Variables
    WebDriver driver;

    //Constructor
    public BookStoreLanding(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    public By usernameValue(){
        return By.id("userName-value");
    }
    //Operations
    public String getUserNameValue (){
        String value = driver.findElement(usernameValue()).getText();
        return value;
    }
}
