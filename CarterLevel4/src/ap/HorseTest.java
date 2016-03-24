package ap;
/*
public class HorseTest {

}
*/

interface Horse {
	String getName();

	int getWeight();
}

class Trigger implements Horse {
	public String getName() {
		return "Trigger";
	}

	public int getWeight() {
		return 1340;
	}
}

class Silver implements Horse {
	public String getName() {
		return "Silver";
	}

	public int getWeight() {
		return 1210;
	}
}

class Patches implements Horse {
	public String getName() {
		return "Patches";
	}

	public int getWeight() {
		return 1350;
	}
}

class Duke implements Horse {
	public String getName() {
		return "Duke";
	}

	public int getWeight() {
		return 1410;
	}
}

class Lady implements Horse {
	public String getName() {
		return "Lady";
	}
	
	public int getWeight() {
		return 1575;
	}
}

class HorseTest {
	public static void main(String args[]) {
		new HorseBarn().consolidate();
		System.out.println(new HorseBarn().findHorseSpace("Patches"));
		for(int i = 0; i < new HorseBarn().getSpaces().length; i++) {
			if(new HorseBarn().getSpaces()[i] == null) {
				System.out.println("null");
				continue;
			}
			System.out.println(new HorseBarn().getSpaces()[i].getName());
		}
	}
}