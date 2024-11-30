package tamrin1.session2.innerclass;

import tamrin1.session2.innerclass.Building.Room;

public class Main {

	public static void main(String[] args) {
		Building hospital = new Building();
		hospital.adr = "Tajrish Sq.";
		Room surgeryRoom = hospital.createRoom("red");
		surgeryRoom.isReady();
	}

}
