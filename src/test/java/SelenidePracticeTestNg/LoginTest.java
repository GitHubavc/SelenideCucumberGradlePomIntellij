package SelenidePracticeTestNg;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    @Test
    void TestLogin() throws InterruptedException {
        Configuration.browser= "chrome";
    open("https://examplefile.com/document/docx/1-mb-docx");
    WebDriverRunner.getWebDriver().manage().window().maximize();
    sleep(10000);
        File downloadfile =$(new ByText("hello world.txt")).download();
//    System.out.println(title());
//    String textNme =$(By.xpath("//a[text()='Store']")).getText();
//    System.out.println("The Text name is : " +textNme);
//    $(By.xpath("//textarea[@id='APjFqb']")).setValue("TestNG").pressEnter();
//    Thread.sleep(3000);
//        //to perform page down
//        actions().
//                keyDown(Keys.COMMAND).
//                keyDown(Keys.ARROW_DOWN).
//                keyUp(Keys.COMMAND).build().perform();
//        Thread.sleep(10000);
 //   $(By.xpath("//h3[normalize-space()='TestNG Documentation']")).click();
//    Thread.sleep(3000);
//    int links=$$(By.xpath("//a")).size();
//    System.out.println("The No of links are : " +links);
//    ElementsCollection ele=$$(By.xpath("//a"));
//
//    for(SelenideElement e:ele){
//        String linkText=e.getText();
//        String links_name= e.getAttribute("href");
//        System.out.println(linkText + " ===== " + links_name);
//    }
    //sleep(600_000);


    }

}
