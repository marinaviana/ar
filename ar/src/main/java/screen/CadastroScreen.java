package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import java.time.temporal.ChronoUnit;

public class CadastroScreen extends BaseScreen{

  @AndroidFindBy(id="fab")
  private MobileElement btnNovo;

  @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
  @AndroidFindBy(className="android.widget.EditText")
  private MobileElement campoNome;

  @AndroidFindBy(id="save")
  private MobileElement btnSalvar;

  @AndroidFindBy(id="tvTitle")
  private MobileElement nomelista;

  public void tocarEmFormulario(){
    btnNovo.click();
  }

  public void inserirNome(String nome){
    campoNome.sendKeys(nome);
  }

  public void salvar() {
    btnSalvar.click();
  }

  public String verLista() {
    return nomelista.getText();
  }
}

