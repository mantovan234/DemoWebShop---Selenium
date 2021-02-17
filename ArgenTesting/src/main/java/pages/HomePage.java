package pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.annotation.PageUrl;
import static org.fluentlenium.core.filter.FilterConstructor.withClass;
import static org.fluentlenium.core.filter.FilterConstructor.withText;

import pages.Navbar.ApparelShoesPage;
import pages.Navbar.BooksPage;
import pages.Navbar.ComputersPage;
import pages.Navbar.DigitalDownloadsPage;
import pages.Navbar.ElectronicsPage;
import pages.Navbar.GiftCardsPage;
import pages.Navbar.JewelryPage;
import pagesHeader.LoginPage;
import pagesHeader.RegisterPage;
import pagesHeader.ShoppingCartPage;
import pagesHeader.WishlistPage;

@PageUrl("http://demowebshop.tricentis.com/")

public class HomePage extends FluentPage {

	@Page 
	private LoginPage homeLogin;
	@Page 
	private RegisterPage homeRegister;
	@Page 
	private ShoppingCartPage homeShoppingCart;
	@Page 
	private WishlistPage homeWishlist;
	
	@Page
	private ApparelShoesPage homeApparelShoes;
	@Page
	private BooksPage homeBooks;
	@Page
	private ComputersPage homeComputers;
	@Page
	private DigitalDownloadsPage homeDigitalDownloads;
	@Page 
	private ElectronicsPage homeElectronics;
	@Page
	private GiftCardsPage homeGiftCards;
	@Page
	private JewelryPage homeJewelry;

	//Header
	public LoginPage ingresoLogin () {
		
		//Esperar hasta que aparezca el Header
		await().until(find ("div", withClass ("header-links-wrapper"))).displayed();
		
		//Click al botón "Log in"
		find ("a", withClass ("ico-login"), withText ("Log in")).click();
		
		//Esperar hasta que aparezca el cartel "Welcome, Please Sign In!"
		await().until(find("h1", withText ("Welcome, Please Sign In!"))).displayed();
		
		return homeLogin;
	}
	
	public RegisterPage ingresoRegister () {
		
		//Esperar hasta que aparezca el Header
		await().until(find ("div", withClass ("header-links-wrapper"))).displayed();
		
		//Click al botón "Register"
		find ("a", withClass ("ico-register"), withText ("Register")).click();
		
		//Esperar hasta que aparezca el cartel "Register"
		await().until(find("h1", withText ("Register"))).displayed();
		
		return homeRegister;
	}
	
	public ShoppingCartPage ingresoShoppingCart () {
		
		//Esperar hasta que aparezca el Header
		await().until(find ("div", withClass ("header-links-wrapper"))).displayed();
		
		//Click al botón "Shopping cart"
		find ("span", withClass ("cart-label"),withText ("Shopping cart")).click();
		
		//Esperar hasta que aparezca el cartel "Shopping cart"
		await().until(find("h1", withText ("Shopping cart"))).displayed();
		
		return homeShoppingCart;
	}
	
	public WishlistPage ingresoWishlist () {
		
		//Esperar hasta que aparezca el Header
		await().until(find ("div", withClass ("header-links-wrapper"))).displayed();
		
		//Click al botón "Wishlist"
		find ("a", withClass ("ico-wishlist")).click();
		
		//Esperar hasta que aparezca el cartel "Wishlist"
		await().until(find("h1", withText ("Wishlist"))).displayed();
		
		return homeWishlist;
	}
	
	//Navbar
	public ApparelShoesPage ingresoApparelShoes () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Apparel & Shoes"
		find ("a", withText ("Apparel & Shoes")).click();
		
		//Esperar hasta que aparezca el cartel "Apparel & Shoes"
		await().until(find ("h1", withText ("Apparel & Shoes"))).displayed();
		
		return homeApparelShoes;
	}
	
	public BooksPage ingresoBooks () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Books"
		find ("a", withText ("Books")).click();
		
		//Esperar hasta que aparezca el cartel "Books"
		await().until(find ("h1", withText ("Books"))).displayed();
		
		return homeBooks;
	}
	
	public ComputersPage ingresoComputers () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Computers"
		find ("a", withText ("Computers")).click();
		
		//Esperar hasta que aparezca el cartel "Computers"
		await().until(find ("h1", withText ("Computers"))).displayed();
		
		return homeComputers;
	}
	
	public ElectronicsPage ingresoElectronics () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Electronics"
		find ("a", withText ("Electronics")).click();
		
		//Esperar hasta que aparezca el cartel "Electronics"
		await().until(find ("h1", withText ("Electronics"))).displayed();
		
		return homeElectronics;
	}
	
	public DigitalDownloadsPage ingresoDigitalDownloads () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Digital Downloads"
		find ("a", withText ("Digital downloads")).click();
		
		//Esperar hasta que aparezca el cartel "Digital Downloads"
		await().until(find ("h1", withText ("Digital downloads"))).displayed();
		
		return homeDigitalDownloads;
	}
	
	public JewelryPage ingresoJewelry () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Jewelry"
		find ("a", withText ("Jewelry")).click();
		
		//Esperar hasta que aparezca el cartel "Jewelry"
		await().until(find ("h1", withText ("Jewelry"))).displayed();
		
		return homeJewelry;
	}
	
	public GiftCardsPage ingresoGiftCards () {
		
		//Esperar hasta que aparezca el Navbar
		await().until(find ("ul", withClass ("top-menu"))).displayed();
		
		//Click al botón "Gift Cards"
		find ("a", withText ("Gift Cards")).click();
		
		//Esperar hasta que aparezca el cartel "Gift Cards"
		await().until(find ("h1", withText ("Gift Cards"))).displayed();
		
		return homeGiftCards;
	}
	
}
