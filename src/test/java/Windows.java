import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Windows {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qacart.com");
        String handle = driver.getWindowHandle();
        System.out.println("The handle ID : " + handle);
        driver.findElement(By.id("el_1662548420535_422")).click();
        System.out.println(driver.getWindowHandles());
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow);
        for (String window:allWindow
             ) {
            if (!window.equalsIgnoreCase(handle) ){
                System.out.println("title 1"+driver.getTitle());
                driver.switchTo().window(window);

                System.out.println("title 2"+driver.getTitle());

            }
        }
        driver.quit();

    }
}
