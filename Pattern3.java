package patternProgram;

public class Pattern3 {

	public static void main(String[] args) {

		int sp=9;
		int k;
		for(int i=1;i<8;i++) {
			for(k=1;k<=sp;k++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			sp--;
			System.out.println();
           
		}
	}

}
