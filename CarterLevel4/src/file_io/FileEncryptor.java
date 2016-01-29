package file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptor {
	public static File openSecretFile() {
		return new File("src/files/Untitled 2");
	}

	public static String readOneLine(File f) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "test";

	}

	public static String readFileContents(File f) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		try {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static String encrypt(String s) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzab";
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			int place = alphabet.indexOf(c);
			place += 2;
			char newChar = alphabet.charAt(place);
			sb.append(newChar);
		}
		return sb.toString();
	}

	public static String decrypt(String s) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == 'a') {
				sb.append("y");
				continue;
			} else if (c == 'b') {
				sb.append("z");
				continue;
			}
			int place = alphabet.indexOf(c);
			place -= 2;
			char newChar = alphabet.charAt(place);
			sb.append(newChar);
		}
		return sb.toString();
	}

	public static File saveFile(String string) {
		File f = new File(string);
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fw.write("blahblahblah");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void saveStuffInAFile(String string, File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fw.write(string);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
