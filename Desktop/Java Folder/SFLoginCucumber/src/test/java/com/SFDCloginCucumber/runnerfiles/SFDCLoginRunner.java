package com.SFDCloginCucumber.runnerfiles;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/login.feature"},
                      glue = {"com.SFDCloginCucumber.stepdefns"} ,
                      dryRun = false,
                      plugin = {"pretty","html:target/cucumber-pom-selenium.html"}
)
public class SFDCLoginRunner extends AbstractTestNGCucumberTests {

}
