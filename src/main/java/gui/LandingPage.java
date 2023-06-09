package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    //Variables
    private WebDriver driver;
    private final String url = "https://demoqa.com/";

    //Constructor
    public LandingPage(WebDriver driver){
        this.driver=driver;
    }

    //Locators
    public By bookStoreCard(){
        return By.xpath("//div[contains(@class, 'category-cards')]/*[6]//h5");
    }

    //Operations
    public void navigate(){
        driver.navigate().to(url);
    }
    public BookStoreApplication clickOnBookStoreCard(){
        driver.findElement(bookStoreCard()).click();
        return new BookStoreApplication(driver);
    }
}
