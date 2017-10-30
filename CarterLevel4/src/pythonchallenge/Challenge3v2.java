package pythonchallenge;

public class Challenge3v2 {
	public static void main(String[] args) {
		runChallenge3();
	}

	static StringBuilder letterCases = new StringBuilder();
	static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String s = "stUUUfFFF";
	static StringBuilder currentString = new StringBuilder();

	private static void runChallenge3() {
		int runs = 0;
		for (char c : s.toCharArray()) {
			if (runs < 7) {
				currentString.insert(0, c);
			} else {
				currentString.deleteCharAt(6);
				currentString.insert(0, c);
				System.out.println();
				letterCases.deleteCharAt(6);
			}
			for (char x : lowerCase.toCharArray()) {
				if (x == c) {
					letterCases.insert(0, "l");
					continue;
				} else {
					letterCases.insert(0, "u");
				}
			}
			System.out.println(letterCases.toString());
			runs++;
			if (runs > 7 && letterCases.toString().equals("uuuluuu")) {
				System.out.println(currentString.toString());
				System.exit(0);
			}
		}
	}


	public boolean isBodyguarded(String string) {
		for (char c : string.toCharArray()) {
			if (lowerCase.contains(Character.toString(c))) {
				letterCases.append("l");
				continue;
			} else if (upperCase.contains(Character.toString(c))) {
				letterCases.append("u");
				continue;
			}
		}
		if (letterCases.toString().equals("uuuluuu")) {
			return true;
		}
		return false;
	}


	public char findSmallLetter(String string) {
		for (char c : string.toCharArray()) {
			if (lowerCase.contains(Character.toString(c))) {
				letterCases.append("l");
				return c;
			}
		}
		return '!';
	}
}
