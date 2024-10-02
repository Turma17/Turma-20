package Elementos;

import org.openqa.selenium.By;

public class ElementosTelaLogin {
	
	private By iconeLogin = By.id("menuUserLink");
	
	private By campoDeUsername = By.name("username");
	
	private By campoDePassword = By.name("password");
	
	private By BtnLogin = By.id("sign_in_btn") ;
	
	
	
	public By getIconeLogin() {
		return iconeLogin;
	}

	public By getCampoDeUsername() {
		return campoDeUsername;
	}

	public By getCampoDePassword() {
		return campoDePassword;
	}

	public By getBtnLogin() {
		return BtnLogin;
	}
		
	
	}
