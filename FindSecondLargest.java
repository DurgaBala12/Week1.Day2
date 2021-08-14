package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] secLarg = {5,1,4,3,7,2,8,10,9};
		Arrays.sort(secLarg);
		System.out.println("Second largest number is " +secLarg[secLarg.length-2]);

	}

}
