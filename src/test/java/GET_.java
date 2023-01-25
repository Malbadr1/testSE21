import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class GET_ {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/mohanadalbadri/Desktop/cypress-course/cypress/index.html");
        String attributeID = driver.findElement(By.cssSelector("[id=\"inputEmail\"]")).getAttribute("id");
        System.out.println(attributeID);
        String tagName = driver.findElement(By.cssSelector("[id=\"inputEmail\"]")).getTagName();
        System.out.println("tagName ia :  " + tagName);

        String css = driver.findElement(By.cssSelector("[id=\"inputEmail\"]")).getCssValue("background-color");
        System.out.println("css is : " + css);
        Dimension name = driver.findElement(By.cssSelector("[id=\"inputEmail\"]")).getSize();
        System.out.println("Size is : " + name);

        Rectangle location = driver.findElement(By.cssSelector("[id=\"inputEmail\"]")).getRect();
        System.out.println("location is : " + location);
        System.out.println(location.x);
        System.out.println(location.y);
        System.out.println(location.height);

        //String accessibleName = driver.findElement(By.cssSelector("[type=\"email\"]")).getAccessibleName();
        //   System.out.println("the accessibleName is : "+ accessibleName);
        String roll = driver.findElement(By.cssSelector("[type=\"email\"]")).getAriaRole();
        System.out.println( roll);

    }
}
