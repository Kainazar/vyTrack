package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetBtn;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicle;
}
