package duplicateElementsArray.com;

public class DuplicateArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,5,6,7,3};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					System.out.println(arr[j]);
					
				}
			}
		}
	}

}
