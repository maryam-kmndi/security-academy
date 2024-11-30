package tamrin1.session2.generic;

//Defined to hold objects of other classes
///no more mismatch error

public class GenericBox <T>{
	private T item;	//T represents generic type

	public GenericBox(T item) {
		super();
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
