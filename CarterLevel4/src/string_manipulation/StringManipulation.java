package string_manipulation;

public class StringManipulation {
	public static void main(String args[]) {
		StringBuilder java = new StringBuilder("java");
		System.out.println("1:  " + java.deleteCharAt(1));
		
		String java2 = "java";
		StringBuilder java3 = new StringBuilder(java2);
		System.out.println("2:  " + java3.replace(1, 2, "i"));
	}
}
