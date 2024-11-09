package ir.isc.exercise2;

public abstract class Person {

		public Person(String name) {
			super();
			this.name = name;
		}

		private String name;
		
		public abstract void notifyy();

		public void awake() {
			System.out.println("Good morning " + name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
