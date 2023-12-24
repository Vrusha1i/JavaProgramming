package stringlowerUpperCase.com;

public class Convert {

	public static void main(String[] args) {

		String str="JavaProgramming";
		
		for(int i=0;i<str.length();i++) {
			str=str.toLowerCase();
		}
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			str=str.toUpperCase();
		}
		System.out.println(str);
	}

}
