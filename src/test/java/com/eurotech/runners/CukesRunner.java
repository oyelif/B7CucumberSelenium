package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false, // false hepsi calisir //true tatbikat
        tags = "@smoke" //or - and de diyebiliriz //"@wip or and not @teacher"
        //@wip = work in progress
)
public class CukesRunner {
}
