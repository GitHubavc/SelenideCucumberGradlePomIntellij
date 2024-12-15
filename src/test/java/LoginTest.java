import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    @Test
    void TestLogin() throws InterruptedException {
    open("https://www.google.co.in/");
    WebDriverRunner.getWebDriver().manage().window().maximize();
    System.out.println(title());
    String textNme =$(By.xpath("//a[text()='Store']")).getText();
    System.out.println("The Text name is : " +textNme);
    $(By.xpath("//textarea[@id='APjFqb']")).setValue("TestNG").pressEnter();
    Thread.sleep(3000);
    $(By.xpath("//h3[normalize-space()='TestNG Documentation']")).click();
    Thread.sleep(3000);
    int links=$$(By.xpath("//a")).size();
    System.out.println("The No of links are : " +links);
    ElementsCollection ele=$$(By.xpath("//a"));

    for(SelenideElement e:ele){
        String linkText=e.getText();
        String linksname= e.getAttribute("href");
        System.out.println(linkText + " ===== " + linksname);
    }
    //closeWebDriver();
    }

}
