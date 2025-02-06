package SelenidePracticeTestNg;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class RadioCheckTest {

    @Test
    void RadioCheckbox(){

        open("https://testcenter.techproeducation.com/index.php");
        sleep(3000);
//        $(By.xpath("//a[text()='Checkboxes']")).click();
//        sleep(3000);
        actions().
                scrollByAmount(0,1000).
                build().perform();
        sleep(5000);
//        SelenideElement box1 = $(By.xpath("//input[@id='box1']"));
//        SelenideElement box2 = $(By.xpath("//input[@id='box2']"));
//
//        if(!box1.isSelected()){
//            box1.shouldNot(Condition.checked);
//            box1.click();
//            sleep(5000);
//            box1.shouldBe(Condition.checked);
//        }else if (!box2.isSelected()){
//            box2.shouldNot(Condition.checked);
//            box2.click();
//            box2.shouldBe(Condition.checked);
//        }
//
//        SelenideElement RadioButtonLink = $(By.xpath("//a[text()='Radio Buttons']"));
//        //executeJavaScript("window.scrollBy(0,document.body.scrollHeight)", "");
//        //to perform page down
//        actions().
//                keyDown(Keys.COMMAND).
//                keyDown(Keys.ARROW_DOWN).
//                keyUp(Keys.PAGE_DOWN).
//               keyUp(Keys.COMMAND).build().perform();
//        RadioButtonLink.click();
//        sleep(2000);
//
//        SelenideElement redRadio = $(By.xpath("//input[@id='red']"));
//        SelenideElement yellowRadio = $(By.xpath("//input[@id='yellow']"));
//        if(!redRadio.isSelected()){
//            redRadio.shouldNot(Condition.checked);
//            redRadio.click();
//            sleep(5000);
//            redRadio.shouldBe(Condition.checked);
//        }else if (!yellowRadio.isSelected()){
//            yellowRadio.shouldNot(Condition.checked);
//            yellowRadio.click();
//            yellowRadio.shouldBe(Condition.checked);
//            sleep(5000);
//
//        }

    }
}
