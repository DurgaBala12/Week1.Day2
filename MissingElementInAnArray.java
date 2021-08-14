package week1.day2;

public class MissingElementInAnArray {
	public static void main(String[] args) 
	{
		int[] arr = {0,1,2,3,4,7,6,8};
		for(int i=0;i< arr.length;i++) 
		{
			if(arr[i] != i) 
			{
				System.out.println("Missing number in the given array is : " + i);
				break;
		}
	}
	}
}
