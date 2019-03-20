package screen;

import helper.AppiumDriverHelper;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BaseScreen {
  public BaseScreen(){
    PageFactory.initElements( new AppiumFieldDecorator(AppiumDriverHelper.getDriver(), Duration.ofSeconds(15) ), this );
  }
}