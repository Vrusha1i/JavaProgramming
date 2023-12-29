package replaceSpaceByCharacter;

public class ReplaceSpace {

	public static void main(String[] args) {
              
		String str="this is java";
		char ch=':';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str=str.replace(' ', ch);
			}
		}
		System.out.println("string after replacing space by character "+str);
	}

}
