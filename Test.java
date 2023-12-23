package copyElement.com;

public class Test {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60,70};
		int arr1[]=new int[arr.length];

		System.out.println("Elemets of old array");
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Elements of new array");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
