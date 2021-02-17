package pages.Navbar;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.annotation.PageUrl;

import org.fluentlenium.core.domain.FluentWebElement;

import static org.fluentlenium.core.filter.FilterConstructor.withClass;
import static org.fluentlenium.core.filter.FilterConstructor.withText;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.support.FindBy;

public class ApparelShoesPage  extends FluentPage{

	private String qty = "10";
	private String qtyCheck = "(10)";
	private String CardCode;
	
	String RandomText = RandomStringUtils.randomAlphabetic(10);
	String RandoNumberCode = RandomStringUtils.randomNumeric(3);
	

	public ApparelShoesPage compraJean () {
		
		//Click a la opción "Blue Jeans"
		find ("a", withText ("Blue Jeans")).click();
		
		//Esperar que aparesca el cuadro de la compra
		await().until(find ("div", withClass ("page product-details-page"))).displayed();
		
		//Completar el campo "Qty"
		find ("#addtocart_36_EnteredQuantity").write(qty);
		
		//Click al botón "Add to cart"
		find ("#add-to-cart-button-36").click();
		
		//Click al botón "Shopping cart"
		find ("span", withClass ("cart-label"),withText ("Shopping cart")).click();
		
		//Esperar hasta que aparezca el cartel "Shopping cart"
		await().until(find("h1", withText ("Shopping cart"))).displayed();
		
		//Click al checkbox de terminos y condiciones
		find ("#termsofservice").click();
		
		//Click al botón "Checkout"
		find ("#checkout").click();
		
		//Esperar hasta que aparezca el cartel "Checkout"
		await().until(find("h1",withText("Checkout"))).displayed();
		
		//Click al botón "Continuar"
		find ("input", withClass ("button-1 new-address-next-step-button")).click();
		
		await().explicitlyFor(2,TimeUnit.SECONDS);
		
		//Click al checkbox "In-Store Pickup"
		find ("#PickUpInStore").click();
		
		//Click al botón "Continuar"
		find ("input", withClass ("button-1 new-address-next-step-button")).click();
		
		await().explicitlyFor(2,TimeUnit.SECONDS);
		
		//Click al checkbox "Credit card"
		find ("#paymentmethod_2").click();
		
		//Clicl al botón "Continuar"
		find ("input", withClass ("button-1 payment-method-next-step-button")).click();
		
		await().explicitlyFor(2,TimeUnit.SECONDS);
		
		//Completar el campo "Cardholder name"
		find ("#CardholderName").write(RandomText);
		
		//Completar el campo "Card number"
		find ("#CardNumber").write("11111111111111111111");
		
		//Seleccionar la fecha de expiracion de la tarjeta
		find ("#ExpireMonth").fillSelect ().withText("12");
		
		//Completar el campo "Card code"
		find ("#CardCode").write(RandoNumberCode);
		
		//Click al botón "Continuar"
		find ("input", withClass ("button-1 payment-info-next-step-button")).click();
		
		await().explicitlyFor(2,TimeUnit.SECONDS);
		
		//Click al botón "Continuar"
		find ("input",withClass ("button-1 confirm-order-next-step-button")).click();
		
		await().explicitlyFor(2,TimeUnit.SECONDS);
		
		//Esperar que aparezca certel "Thank you"
		await().until(find("h1",withText ("Thank you"))).displayed();
		
		//Click al botón "Continuar"
		find ("input", withClass ("button-2 order-completed-continue-button")).click();
		
		//Verificar que se haya hecho la compra correctamente
		assertThat (find ("a", withClass ("ico-cart")).find("span", withClass ("cart-qty"),withText ("(0)")).first().displayed());
		
		return this;
	}
	
}
