package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.AppiumDriverHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = "stepDefinition", tags = {"~@instrumentado/unitário", "~@visualRegression"})
public class CucumberTestRunner {

  @BeforeClass
  public static void tearUp(){
    AppiumDriverHelper.getDriver();

  }

  @AfterClass
  public static void tearDown(){
    AppiumDriverHelper.closeDriver();

  }

}