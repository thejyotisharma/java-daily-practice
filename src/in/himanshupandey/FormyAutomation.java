package in.himanshupandey;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class FormyAutomation {
   private WebDriver driver = null;

    public void startBrowser() {
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
    }

    public void setText(String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }
   public void checkOption(String id ){
        driver.findElement(By.id(id)).click();
    }
    public void setExperience(String id,String value ){
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByValue(value);
    }
    public void submit(){
        driver.findElement(By.linkText("Submit")).click();

    }
}