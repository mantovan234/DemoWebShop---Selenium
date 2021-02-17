package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;

import org.testng.annotations.*;

import pages.HomePage;

public class ControladorPositivo extends FluentTestNg {

	//-----------------DECLARACIÓN DE VARIABLES-----------------------------	
	private static String usuario = "federico.giangrecco@qactions.test";
	private static String password = "Tosca1234!";
	
    @Page
    HomePage HomePage;
    
    public WebDriver driver;
    // Overrides the default driver
    @Override
    public WebDriver newWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        return driver;
    }

    //--------------------Login
    //Test Logueo correcto
	 @Test(description = "Test de Logueo", groups= {"Apparel & Shoes"}, priority=1)
	    public void login() {
	    	goTo(HomePage)
	    	.ingresoLogin()
	    	.logeoPositivo(usuario,password);
	    }
	 
    //--------------------Apparel & Shoes
    //Test compra en Apparel & Shoes
    @Test(description = "", groups= {"Apparel & Shoes"}, priority=1)
    public void flujoDeCompra() {
    	goTo(HomePage)
    	.ingresoLogin()
    	.logeoPositivo(usuario,password)
    	.ingresoApparelShoes()
    	.compraJean()
    	;
    }
}
