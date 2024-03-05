package org.mobile;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "org.mobile")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@SMOKE")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,
        value = "pretty, summary, json:target/reports/cucumber-reports/cucumber.json,"
                + "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
public class TestRunner {}
