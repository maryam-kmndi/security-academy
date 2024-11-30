package tamrin1.session4.serialize;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private transient String password;	//mark property -> not get serialize
	
}
