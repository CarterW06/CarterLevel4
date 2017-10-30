package pythonchallenge;


public class challenge1 {
	public static void main(String[] args) {
		String s = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
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