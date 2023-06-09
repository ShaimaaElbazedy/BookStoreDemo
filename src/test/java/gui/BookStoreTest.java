package gui;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BookStoreTest {

    //Creating instance of the webdriver
    WebDriver driver;
    //Creating instance from needed screens
    LandingPage landingPage;
    LoginScreen loginScreen;
    BookStoreApplication bookStoreApplication;
    BookStoreLanding bookStoreLanding;

    /*JSONParser jsonParser;
    FileReader reader;
    Object objReader;*/


    @Test (priority  = 1, description = "Clicking on BookStoreApplication card")
    public void navigatingThroughBookStoreCard(){
        landingPage.clickOnBookStoreCard();
        Assert.assertEquals(driver.getTitle(),"Book Store");
        bookStoreApplication.loginButton();
    }

    @Test (priority  = 2, description = "Logging with credentials")
    public void login(){
       loginScreen.typeUsername("shaimaa");
       loginScreen.typePassword("Password@12345");
       loginScreen.clickOnLoginButton();
       Assert.assertTrue(bookStoreLanding.getUserNameValue().equals("shaimaa"));
    }





    @BeforeClass
    public void beforeClass() throws IOException, ParseException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*jsonParser = new JSONParser();
        reader = new FileReader("testDataFile.json");
        objReader = jsonParser.parse(reader);*/
        landingPage = new LandingPage(driver);
        landingPage.navigate();
        loginScreen = new LoginScreen(driver);
        bookStoreApplication = new BookStoreApplication(driver);
        bookStoreLanding = new BookStoreLanding(driver);


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
