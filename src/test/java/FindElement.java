import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FindElement {
    public static void main(String[] args) {

        WebDriver webDriver = new SafariDriver();
        webDriver.get("file:///Users/mohanadalbadri/Desktop/cypress-course/cypress/index.html");
        webDriver.manage().window().maximize();
        //  Dimension se = new Dimension(596, 1234);
        // webDriver.manage().window().setSize(se);
        //String title = webDriver.getTitle();
        // System.out.println("the title is : " + title);
        //String source= webDriver.getPageSource();
        //System.out.println("the source is :"+source);
       /* webDriver.navigate().refresh();
        String elementText = webDriver.findElement(By.id("welcome")).getText();
        String elementText2 = webDriver.findElement(By.name("courses")).getText();
        String elementText3= webDriver.findElement(By.className("about")).getText();
        String elementText4= webDriver.findElement(By.tagName("li")).getText();
        String elementText6= webDriver.findElement(By.partialLinkText("About")).getText();
        System.out.println("by class :"+elementText3);
        System.out.println(elementText);
        System.out.println("this is by name:"+elementText2);
        System.out.println("this by tag:"+elementText4);
        System.out.println("this by partialLinkText"+elementText6);*/
       // String elementCss = webDriver.findElement(By.cssSelector("#welcome")).getText();
       // System.out.println(elementCss);
        String elementCss1 = webDriver.findElement(By.cssSelector(".list1 ")).getText();
        System.out.println(elementCss1);
        String elementCss2 =webDriver.findElement(By.cssSelector("[type=\"button\"]")).getText();
        System.out.println(elementCss2);



        webDriver.quit();
    }
}
