package ascendingOrderArray.com;

public class Check {

	public static void main(String[] args) {

		int arr[]= {10,5,30,50,20,39,70,47};
		
		int arr1=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					arr1=arr[i];
					arr[i]=arr[j];
					arr[j]=arr1;
				
			}
			
				
			}
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
