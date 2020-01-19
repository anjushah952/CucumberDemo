package stepsDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStepsDefination {

    WebDriver webDriver;

    @Given("^user is in login page$")
    public void user_is_in_login_page(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        System.setProperty("webdriver.chrome.driver", "/Users/rajkumarshah/Documents/Selenium/chromedriver");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.facebook.com/");
    }

    @When("^title of the page is crm login page$")
    public void title_of_the_page_is_crm_login_page()  {
       String title = webDriver.getTitle();
       Assert.assertEquals("Facebook - Log In or Sign Up",title);
    }

    //Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
    @Then("^user enter's \"(.*)\" and \"(.*)\"$")
    public void user_enter_s_username_and_password(String username,String password) {
        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        webDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);


    }

    @Then("^user clicks login button$")
    public void user_clicks_login_button() {
        webDriver.findElement(By.xpath("//input[@value='Log In']")).click();

    }

    @Then("^\"(.*)\" enter home page$")
    public void users_enter_home_page(String userId) {
        String username = webDriver.findElements(By.xpath("//div[@class='linkWrap noCount' and @dir='ltr']")).get(0).getText();
        Assert.assertEquals(userId,username);
    }

    @Then("^users logout$")
    public void users_logout() {
//
//        webDriver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
//        webDriver.findElement(By.xpath("//span//span[.='Log Out']")).click();

        webDriver.close();
    }
}
