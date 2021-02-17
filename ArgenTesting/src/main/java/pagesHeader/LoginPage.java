package pagesHeader;

import java.util.concurrent.TimeUnit;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.annotation.PageUrl;

import org.fluentlenium.core.domain.FluentWebElement;

import static org.fluentlenium.core.filter.FilterConstructor.withClass;
import static org.fluentlenium.core.filter.FilterConstructor.withText;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.support.FindBy;

import pages.HomePage;

public class LoginPage extends FluentPage {

	@Page
	private HomePage homeHome;
	
	public LoginPage logeo (String user, String pass) {
		
		//Completar el campo "Email"
		find ("#Email").write(user);
		
		//Completar el campo "Password"
		find ("#Password").write(pass);
		
		//Click al botón "Log in"
		find ("input", withClass ("button-1 login-button")).click();
		
		//Verificación del nombre de usuario es correcto
		assertThat (find ("a", withClass ("account"), withText (user)).first().displayed());
		
		return this;
	}
	
	public LoginPage logueoNegativo (String user, String pass) {
		
		//Completar el campo "Email"
		find ("#Email").write(user);
		
		//Completar el campo "Password"
		find ("#Password").write(pass);
		
		//Click al botón "Log in"
		find ("input", withClass ("button-1 login-button")).click();
		
		//Verificación del nombre de usuario es incorrecto
		assertThat (find ("span", withText ("Login was unsuccessful. Please correct the errors and try again.")).first().displayed());
		
		return this;
	}
	
	public HomePage logeoPositivo (String user, String pass) {
		
		//Completar el campo "Email"
		find ("#Email").write(user);
		
		//Completar el campo "Password"
		find ("#Password").write(pass);
		
		//Click al botón "Log in"
		find ("input", withClass ("button-1 login-button")).click();
		
		//Verificación del nombre de usuario es correcto
		assertThat (find ("a", withClass ("account"), withText (user)).first().displayed());
		
		return homeHome;
	}
}
