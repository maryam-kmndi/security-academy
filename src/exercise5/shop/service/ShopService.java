package exercise5.shop.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import exercise5.shop.model.Product;
import exercise5.shop.model.ProductCategory;
import exercise5.shop.service.exception.CategoryNotFoundException;
import exercise5.shop.service.exception.ProductNotFoundException;

public class ShopService {
	private static final Logger logger = Logger.getLogger(ShopService.class.getName());

	private static List<Product> products;
	static {
		logger.setLevel(Level.ALL);

		Product p1 = new Product("Nokia Phone", 150.00, ProductCategory.DIGITAL, false);
		Product p2 = new Product("Nokia T-Shirt", 10.00, ProductCategory.CLOTHING, true);
		Product p3 = new Product("Sofa", 1200.00, ProductCategory.HOME, false);
		Product p4 = new Product("Vacuum Cleaner", 299.49, ProductCategory.HOME, true);
		Product p5 = new Product("Jeans", 49.99, ProductCategory.CLOTHING, true);
		Product p6 = new Product("Laptop", 999.99, ProductCategory.DIGITAL, false);
		
		products = List.of(p1, p2, p3, p4, p5, p6);
	}
	
	public static void returnCategories() {
		logger.info("Category returning");
		 System.out.println("Available Product Categories:");
	        for (ProductCategory category : ProductCategory.values()) {
	            System.out.println(category);
	        }
	}
	
    public static List<Product> findProductsByName(String name) throws ProductNotFoundException {
    	logger.fine("searching for product: " + name);
    	if (name == null || name.isEmpty()) {
    		logger.info("No product name entered.");
            return products; // Return all products if name is not specified
    	}
    	 
    	List<Product> res = products
        				.stream()
        				.filter(product -> product.productName().contains(name))
        				.collect(Collectors.toList());
        if (res.size() == 0) {
        	logger.warning(name + "not found.");
			throw new ProductNotFoundException("No product found with name " + name);
		}
        return res;
    }
	
	public static List<Product> findProductsByCategory(ProductCategory pCat) throws CategoryNotFoundException {
    	logger.fine("searching for category: " + pCat);
		if (pCat == null) {
			  logger.info("No category name entered.");
              return products; // Return all products if category is not specified
        }
		
		List<Product> res = products
						.stream()
						.filter(p -> p.productCategory().equals(pCat))
						.collect(Collectors.toList());
		 if (res.size() == 0) {
	        	logger.warning(pCat + "not found.");
				throw new CategoryNotFoundException("No product found in cayegory " + pCat);
			}
	        return res;
	}
	
	  public static List<Product> findProductsByNameAndCategory(String name, ProductCategory pCat) throws ProductNotFoundException {
          List<Product> filteredByName = findProductsByName(name);
      	
          logger.fine("searching for product: " + name + " ,from category: " + pCat);
          
          return filteredByName
        		  				.stream()
        		  				.filter(p -> pCat == null || p.productCategory() == pCat)
        		  				.collect(Collectors.toList());
      }
	
	  //Or do it in one step
	  public static List<Product> findProducts(String name, ProductCategory category)
		        throws ProductNotFoundException, CategoryNotFoundException {

		    List<Product> filteredByName = products;
	      	
		    logger.fine("searching for product: " + name + " ,from category: " + category);
	      	
		    if (name != null && !name.isEmpty()) {
		        filteredByName = products.stream()
		                .filter(product -> product.productName().contains(name))
		                .collect(Collectors.toList());
		        if (filteredByName.isEmpty()) {
		            throw new ProductNotFoundException("No products found with name: " + name);
		        }
		    }

		    List<Product> filteredByCategory = filteredByName;
		    if (category != null) {
		        filteredByCategory = filteredByName.stream()
		                .filter(product -> product.productCategory() == category)
		                .collect(Collectors.toList());
		        if (filteredByCategory.isEmpty()) {
		            throw new CategoryNotFoundException("No products found in category: " + category);
		        }
		    }

		    return filteredByCategory; 
		}

}
