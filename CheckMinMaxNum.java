package smallestLargestElementArray.com;

public class CheckMinMaxNum {

	public static void main(String[] args) {

		int  arr[]= {25,10,35,50,20,100,39};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			
		}
		System.out.println("smallest elements is "+min);
		
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			
		}
		System.out.println("largest elements is "+max);
		
	}

}
