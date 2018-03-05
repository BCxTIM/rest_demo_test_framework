package com.timrusso.rest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by tmoiseev on 3/5/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@Run"},
        format = {"pretty", "json:target/cucumber.json","html:target/cucumber.html"},
        features = {"src/test/resources/features/"})
public class CucumberRunner {
}
