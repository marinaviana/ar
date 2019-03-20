
package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import screen.CadastroScreen;


public class CadastroSteps {

  private CadastroScreen screen = new CadastroScreen();

  @Dado("^que estou na tela do formulário$")
  public void que_estou_na_tela_do_formulário() {
    screen.tocarEmFormulario();
  }

  @Quando("^quando preencher os dados do cadastro corretamente$")
  public void quando_preencher_os_dados_do_cadastro_corretamente() {
    screen.inserirNome("Pedro alvares");
  }

  @Quando("^enviar o cadastro$")
  public void enviar_o_cadastro() {
    screen.salvar();
  }

  @Então("^devo ver os dados enviados$")
  public void devo_ver_os_dados_enviados()  {
    Assert.assertEquals("Pedro alvares", screen.verLista());
  }



}
