import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interact {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/mohanadalbadri/Desktop/cypress-course/cypress/index.html");
        //driver.findElement(By.cssSelector("[id=\"inputEmail\"]")).sendKeys("Albadri@gmx.net");
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("12345");
        boolean isSelected=driver.findElement(By.cssSelector("[value=\"remember-me\"]")).isDisplayed();
        System.out.println("isSelected"+isSelected);
        Select courseDropDown = new Select(driver.findElement(By.id("courses")));
       // courseDropDown.selectByValue("selenium");
        courseDropDown.selectByIndex(0);
       // boolean emailIsDisplayed= driver.findElement(By.cssSelector("[type=\"email\"]")).isDisplayed();
       // System.out.println(emailIsDisplayed);
        boolean emailEnable= driver.findElement(By.cssSelector("type=\"email\"")).isEnabled();
        System.out.println(emailEnable);

    }
}
