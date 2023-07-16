package demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void successTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Anton");
        $("#userEmail").setValue("sdfsd@mail.com");
        $("#currentAddress").setValue("Some address1");
        $("#permanentAddress").setValue("Some address2");
        $("#submit").click();

        $("#output #name").shouldHave(text("Name:Anton"));
        $("#output #email").shouldHave(text("Email:sdfsd@mail.com"));
        $("#output #currentAddress").shouldHave(text("Current Address :Some address1"));
        $("#output #permanentAddress").shouldHave(text("Permananet Address :Some address2"));



    }
}
