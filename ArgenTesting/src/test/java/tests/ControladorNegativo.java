package tests;

import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pages.HomePage;

public class ControladorNegativo  extends FluentTestNg{

	//-----------------DECLARACIÓN DE VARIABLES-----------------------------	
	private static String usuario = "federico.giangrecco@qactions.test";
	private static String password = "PasswordIncorrecta!";
	
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
	
	 @Test(description = "", groups= {"Apparel & Shoes"}, priority=1)
	    public void loginFallido() {
	    	goTo(HomePage)
	    	.ingresoLogin()
	    	.logueoNegativo(usuario,password);
	    }
}
