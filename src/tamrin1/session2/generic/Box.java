package tamrin1.session2.generic;

public class Box {
	private Object item;	//Object is parent of all types

	public Box(Object item) {
		super();
		this.item = item;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}
