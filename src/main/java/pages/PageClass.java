package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

import static utils.TestBase.driver;

public class PageClass extends TestBase {

    //private WebDriver driver;

    public PageClass(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Create account')]")
    private WebElement createAccount;

        public void clickSignInBtn(){
            createAccount.click();
    }
}
