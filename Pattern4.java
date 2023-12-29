package patternProgram;

public class Pattern4 {

	public static void main(String[] args) {

		int i,j,k,sp=0;
		
		for(i=0;i<6;i++) {
			for(k=6;k>sp;k--) {
				System.out.print(" ");
				
			}
			
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			sp++;
			System.out.println();
		}
		
	}

}
