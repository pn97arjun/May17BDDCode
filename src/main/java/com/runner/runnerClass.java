package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-json/cucumber.json","junit:target/cucumber.xml"},
        glue={"classpath: com.stepdefinition"},
        features = {"classpath:Features/"},
        tags="@Test1",
publish = true)
public class runnerClass {


}
