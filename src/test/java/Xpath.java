import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Xpath {
    public static void main(String[] args) {
        /*
        we should use this is  xpath $x=("//tagName[@id=`welcome´]")
        xpath Absolute $x=("//html/body/ul[2]/li[2]")

         */
        WebDriverManager.safaridriver().setup();
        WebDriver webDriver= new SafariDriver();
        webDriver.get("file:/Users/mohanadalbadri/IdeaProjects/testSE2/src/test/resourse/index.html");
        webDriver.manage().window().maximize();
       // String xpathText=webDriver.findElement(By.xpath("/html/body/ul[2]/li[2]")).getText();
      //  System.out.println("this is xpath value :"+xpathText);

        String xpathDate= webDriver.findElement(By.xpath("//*[@data-testid='welcome-Albadri']")).getText();
        System.out.println("this is xpath import :"+ xpathDate);



    }
}
