package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodosLoginPage {
	
	WebDriver nav;
	
	public void abrirNavegador (String url) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	nav = new ChromeDriver();
	nav.manage().window().maximize();
	nav.get(url);		
	}
	
	public void clicar (By elemento) {
		nav.findElement(elemento).click();
		
	}
	
	public void preencherCampo(By elemento, String texto) {
		nav.findElement(elemento).sendKeys(texto);
	}
	
	public void pausar (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void fecharNavegador () {
		nav.quit();
	}
	
}
