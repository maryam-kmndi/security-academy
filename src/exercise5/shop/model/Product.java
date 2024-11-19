package exercise5.shop.model;

public record Product(
		String productName, double price, ProductCategory productCategory, boolean forSale
		) {

	@Override
	public String toString() {
		return "productName = " + productName + ", price = " + price 
				+ ", productCategory = " + productCategory
				+ ", forSale = " + forSale + "\n";
	}

}
