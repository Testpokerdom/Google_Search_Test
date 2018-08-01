package Google_Search_results_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsForWebElements {

    //Page Factory
    public LocatorsForWebElements(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    // Main Google search page elements
    @FindBy (xpath = "//div[@id='sb_ifc0']//input[@name='q']")
    public WebElement fieldSearch;
    @FindBy (xpath = "//div[@class='tsf-p']//input[@name='btnK']")
    public WebElement buttonSearch;
    @FindBy (xpath = "//div[@class='sbsb_g']/span[1]//input[@class='lsb']")
    public WebElement buttonSearchInDropDownList;
    @FindBy (xpath = "//div[@class='tsf-p']//input[@name='btnI']")
    public WebElement buttonFeelingLucky;

    // Fourth element in Google search list
    @FindBy(xpath = "//a[contains(.,'How To Export Tests from Selenium IDE - Elemental Selenium')]")
    public WebElement searchResult;
    @FindBy(xpath = "//a[contains(.,'From IDE exporting Selenese to C# instantiates same variable ...')]")
    public WebElement searchResult2;

    public void fillSearchField(String searchText){
        fieldSearch.clear();
        fieldSearch.sendKeys(searchText);
        fieldSearch.submit();
    }



}
