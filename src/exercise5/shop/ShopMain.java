package exercise5.shop;

import java.util.List;

import exercise5.shop.model.Product;
import exercise5.shop.model.ProductCategory;
import exercise5.shop.service.ShopService;
import exercise5.shop.service.exception.CategoryNotFoundException;
import exercise5.shop.service.exception.ProductNotFoundException;

public class ShopMain {

	public static void main(String[] args) {
		try {
			List<Product> productsByName = ShopService.findProductsByName("Laptop");
			List<Product> productsByCat = ShopService.findProductsByCategory(ProductCategory.HOME);
			List<Product> productsByNameCat = ShopService.findProductsByNameAndCategory("Nokia",ProductCategory.DIGITAL);
			List<Product> productsFounded = ShopService.findProducts("Nokia", null);
			List<Product> productsFounded2 = ShopService.findProducts("Nokia", ProductCategory.DIGITAL);

			ShopService.returnCategories();
			System.out.println(productsByName);
			System.out.println(productsByCat);
			System.out.println(productsByNameCat);
			System.out.println(productsFounded);
			System.out.println(productsFounded2);
			
		} catch (ProductNotFoundException | CategoryNotFoundException e) {
			e.printStackTrace();
		}
	}

}
