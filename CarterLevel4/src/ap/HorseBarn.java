package ap;

class HorseBarn {
	private static Horse[] spaces = new Horse[7];

	{
		initializeHorses();
	}

	void initializeHorses() {
		spaces[0] = new Trigger();
		spaces[2] = new Silver();
		spaces[3] = new Lady();
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
	
	static HorseBarn createTestBarn() {
		HorseBarn horseBarn = new HorseBarn();
		horseBarn.initializeHorses();
		return horseBarn;
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
	
	Horse[] getSpaces() {
		return spaces;
	}
}