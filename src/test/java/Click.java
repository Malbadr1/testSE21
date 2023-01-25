import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Click {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/mohanadalbadri/Desktop/cypress-course/cypress/index.html");

       /* Actions actions= new Actions(driver);
        WebElement button = driver.findElement(By.cssSelector(".trigger"));
        actions.moveToElement(button).perform();*/

        /*Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector(".source"));
        WebElement destination = driver.findElement(By.cssSelector(".destination"));
        actions.dragAndDrop(source,destination);*/
        




    }
}
