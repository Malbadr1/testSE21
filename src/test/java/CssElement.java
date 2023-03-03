import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/master
public class CssElement {
    public static void main(String[] args) {

        // for id #value
        // for class .className
        // for else [key=value]
        WebDriverManager.safaridriver().setup();
        WebDriver webDriver = new SafariDriver();
        webDriver.get("file:///Users/mohanadalbadri/Desktop/cypress-course/cypress/index.html");
        webDriver.manage().window().maximize();
        String elementCss = webDriver.findElement(By.cssSelector("#welcome")).getText();
        System.out.println(elementCss);
<<<<<<< HEAD
        /*String elementCss1 = webDriver.findElement(By.cssSelector(".list2")).getText();
=======
        String elementCss1 = webDriver.findElement(By.cssSelector(".list2")).getText();
>>>>>>> origin/master
        System.out.println(elementCss1);
        String elementCss2 = webDriver.findElement(By.cssSelector("[type=\"checkbox\" ]")).getText();
        System.out.println(elementCss2);
        String elementCss3= webDriver.findElement(By.cssSelector(".course-list > .list3")).getText();
<<<<<<< HEAD
        System.out.println(elementCss3);*/
        List<WebDriver> listOfCourse = (List<WebDriver>) webDriver.findElement(By.cssSelector(".course-list li"));
        System.out.println(listOfCourse.size());
=======
        System.out.println(elementCss3);
>>>>>>> origin/master
        webDriver.quit();
    }
}
