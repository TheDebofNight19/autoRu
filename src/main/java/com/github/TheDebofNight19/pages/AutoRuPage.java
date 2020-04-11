package com.github.TheDebofNight19.pages;

import DataStorage.DataStorage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;



import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AutoRuPage {

//    DataStorage dataStorage = new DataStorage();
//
//    String offersNumber = "./following::div";

    public static String getButtonText(){
        String s = $(byXpath("//span[@class='ButtonWithLoader__content']"))
                .text()
                .replaceAll(" ", "");
        return s;
    }
//
//    public void findOffers(String text){
//        dataStorage.setManufacturerQuantity($(byText(text))
//                .find(byXpath(offersNumber)).text());
//    }

}
