package removeWhiteSpaceString.com;

public class TestString {

	public static void main(String[] args) {
//
//		String str="Welcome in java coding";
//		
//		str=str.replaceAll("\\s+","");
//		
//		System.out.println("String after removing all string "+str);
		
		
		String str1="This Is Windows  10";
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==' ') {
				str1=str1.replace(" ", "");
			}
			
		}
		System.out.println("new string after replacing white spaces is "+str1);
	}

}
