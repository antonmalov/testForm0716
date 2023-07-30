package demoqa.tests;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class cssXpathExamples {

    void cssXpathExample() {
        //поиск по атрубуту data-testid="email"
        // <input type="email" class="inputtext" login_form_input_box" name="email" id="email" data-testid="email">
        $("input[data-testid=email]").setValue("1");
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@]data-testid='email']").setValue("1");
        $(byXpath("//*[@]data-testid='email']")).setValue("1");

        //поиск по id
        // <input type="email" class="inputtext" login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("1");
        $("[#email]").setValue("1");
        $("[input#email]").setValue("1");

        //поиск по имени
        // <input type="email" class="inputtext" login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        // поиск по классу
        // <input type="email" class="inputtext" login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $("[input.inputtext.login_form_input_box]").setValue("1");


        //поиск вложенного локатора
        // <div class="inputtext">
        //  <input type="email" class="login_form_input_box">
        // </div>

        $(".inputtext .login_form_input_box").setValue("1");
        $("div.inputtext input.login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");


        //поиск по тексту
        //<div>Hello, qa.guru!</div>
        $x("//div[text()='Hello, qa.guru!']").click();
        $(byText("Hello, qa.guru!")).click();
        $(withText("lo, qa.guru!")).click();


    }
}
