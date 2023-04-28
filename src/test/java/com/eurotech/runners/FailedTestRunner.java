package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/failed-html-reports.html"}, // ilk  satir , rapor almak icin
        features = "@target/rerun.txt",
        glue = "com/eurotech/step_definitions"
)
public class FailedTestRunner {
}
