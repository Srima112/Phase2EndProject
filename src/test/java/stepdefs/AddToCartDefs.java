package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartDefs {
	
	WebDriver driver = Hooks.driver;
	
	@When("i click on the product name as {string}")
	public void i_click_on_product_name_as(String productname) throws InterruptedException
	{
		WebElement prod_name = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		prod_name.click();
		Thread.sleep(2000);
	}
	
	@And("I click on the add to cart Button")
	public void I_click_on_the_add_to_cart_Button() throws InterruptedException
	{
		WebElement add_to_cart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add_to_cart.click();
		Thread.sleep(2000);
	}
	@And("I click on shopping cart link")
	public void I_click_on_shopping_cart_link() throws InterruptedException
	{
		WebElement add_to_cart = driver.findElement(By.className("shopping_cart_link"));
		add_to_cart.click();
		Thread.sleep(2000);
	}
	@Then("I verify the item on cart page")
	public void i_verify_the_item_on_cart_page() throws InterruptedException 
	{
		WebElement productTitleOnCartPage = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String actualProductName = productTitleOnCartPage.getText();
		Thread.sleep(2000);
		String expectedProductName = "Sauce Labs Backpack";
		Assert.assertEquals(actualProductName, expectedProductName);
	}
}
