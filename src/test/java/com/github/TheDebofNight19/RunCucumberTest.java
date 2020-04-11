package com.github.TheDebofNight19;

import com.codeborne.selenide.Configuration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


@CucumberOptions(plugin = "json:target/cucumber-report.json",
                features = "src/test/java/resources/feature",
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                glue = "cucumber.StepDefinition")

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @BeforeMethod
    public void selenideConfig(){

        Configuration.browser = "chrome";
        Configuration.clickViaJs = true;
    }

}