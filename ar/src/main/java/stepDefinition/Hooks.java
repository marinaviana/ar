package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import helper.AppiumDriverHelper;
import support.Utils;

import java.io.File;

public class Hooks {

  @After
  public void after(Scenario scenario){
    if (scenario.isFailed()) {
      File screenshot = Utils.gerarScreenShot(scenario);
      Utils.embedScreenshot(screenshot, scenario.getName());
    }
    AppiumDriverHelper.relaunchApp();

  }

}