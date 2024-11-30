package tamrin1.session3.map;

import java.util.HashMap;
import java.util.Map;

public class MapCreate {

	public static void main(String[] args) {

		Product p1 = new Product("Laptop", 500.00);
		
		//create map (key, value)
		Map<String, Product> productMap = new HashMap<>();
		
		productMap.put("p001", p1);
		productMap.put("p002", new Product("Smart phone", 250.00));
		productMap.put("p003", new Product("Headphone", 35.00));
		productMap.put("p004", new Product("Smart watch", 50.00));	

		//To read map
		for (Map.Entry<String, Product> entry : productMap.entrySet()) {
			String key = entry.getKey();
			Product val = entry.getValue();
			System.out.println("Key: " + key + " , Product: " + val);
		}
		
		//utilities
		Product founded = productMap.get("p003");	//return value object
		
		Product removed = productMap.remove("p001");	//modify productMap and return removed one
		
		Boolean found = productMap.containsKey("p004");
		Boolean found2 = productMap.containsValue(p1);
		
		
	}
}
