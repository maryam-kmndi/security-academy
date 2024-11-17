package is.isc.ex4;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	private static final long serialVersionUID = 1L; 

    private String name;
    private List<String> accounts;
    private transient String cartNumber;
    private transient String password;
	
	public User(String name, List<String> accounts, String cartNumber, String password) {
		super();
		this.name = name;
		this.accounts = accounts;
		this.cartNumber = cartNumber;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}
	
	public String getCartNumber() {
		return cartNumber;
	}
	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", accounts=" + accounts + "]";
	}
}
