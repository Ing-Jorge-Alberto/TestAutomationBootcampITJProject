import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTests {
    WebDriver Driver;
    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver","/Users/jxc0622/Documents/WebDrivers/chromedriver");
        WebDriver Driver = new ChromeDriver();
    }
    @Test
    public void CategoriesTest(){
        WebElement testCategories=Driver.findElement(By.xpath("//a[@id='cat']"));
        testCategories.isDisplayed();
        String url = Driver.getCurrentUrl();
        String view ="Search view";
        CustomAssertions.isCategoriesDisplayed(true,view,url);
    }
}
