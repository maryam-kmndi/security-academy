package tamrin1.session2.innerclass;

//own -> independent: in properties we wrote "Car c;"
//has-a -> dependent (Objects life cycle are tied): InnerClass (group classes which belongs together)

public class Building {
		//Buildings property
		public String adr;
		public Room room;	//means: building has a room
		
		//نیمچه کانستراکتور :)
		Room createRoom(String color) {
			return room = new Room(color);
		}
		
		//Inner class
		public class Room{
			//Rooms property
			public String color;
			
			//Rooms constructor
			public Room(String color) {
				super();
				this.color = color;
			}

			//Rooms method
			public boolean isReady() {
				return true;
			}
		}
}
