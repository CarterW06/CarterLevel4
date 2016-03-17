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

class HorseBarn {
	Horse[] spaces = new Horse[7];

	{
		spaces[0] = new Trigger();
		spaces[2] = new Silver();
		spaces[5] = new Patches();
		spaces[6] = new Duke();
	}

	void consolidate() {
		Horse[] correctList = new Horse[spaces.length];
		int location = 0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] == null) {
				continue;
			}
			correctList[location] = spaces[i];
			location++;
		}
		spaces = correctList;
	}

	int findHorseSpace(String s) {
		for (int i = 0; i < spaces.length; i++) {
			try {
				if (s.equals(spaces[i].getName())) {
					return i;
				}
			} catch (Exception e) {

			}
		}
		return -1;
	}
}

class HorseTest {
	public static void main(String args[]) {
		System.out.println(new HorseBarn().findHorseSpace("Patches"));
		new HorseBarn().consolidate();
		System.out.println(new HorseBarn().spaces);
	}
}