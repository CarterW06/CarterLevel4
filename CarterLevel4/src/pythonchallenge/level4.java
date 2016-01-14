package pythonchallenge;


public class level4 {
	public static void main(String[] args) {
		String s = "map";
		String alphabet = "abcdefghijklmnopqrstuvwxyzab";
		System.out.println(alphabet.length());
		for (char c : s.toCharArray()) {
			int num1 = alphabet.indexOf(c);
			num1 += 2;
			Object done;
			if(c == '.' || c == ' ') {
				done = c;
				System.out.print(done);
				continue;
			}
			try {
				done = alphabet.charAt(num1);
				System.out.print(done);
				continue;
			} catch (java.lang.StringIndexOutOfBoundsException jlsioobe) {
				
			}
		}
	}
}