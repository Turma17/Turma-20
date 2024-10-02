package Steps;

import Elementos.ElementosTelaLogin;
import Metodos.metodosLoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class teste {
	ElementosTelaLogin e = new ElementosTelaLogin();
	metodosLoginPage m = new metodosLoginPage();

	@Dado("que estou no site {string}")
	public void que_estou_no_site(String url) throws InterruptedException {
		m.abrirNavegador(url);
		m.pausar(2000);
	}	
	
	@Quando("clicar em icone de logar")
	public void clicar_em_icone_de_logar() throws InterruptedException {
		m.clicar(e.getIconeLogin());
		m.pausar(2000);
	}

	@Quando("preencher campo de usuario")
	public void preencher_campo_de_usuario() {
		m.preencherCampo(e.getCampoDeUsername(), "turma20");
		
	}

	@Quando("preencher campo de senha")
	public void preencher_campo_de_senha() {
		m.preencherCampo(e.getCampoDePassword(), "Hassan372");
	}

	@Quando("clicar para logar")
	public void clicar_para_logar() throws InterruptedException {
		m.clicar(e.getBtnLogin());
		m.pausar(2000);
	}

	@Entao("e logado com sucesso")
	public void e_logado_com_sucesso() {
		m.fecharNavegador();
	}

}
