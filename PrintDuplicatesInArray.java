package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = { 10,20,10,20,30,32,45,32,56,21,56};
		boolean dup;
		for (int i = 0; i < arr.length; i++) {
			dup = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dup = true;
				}
			}
			if (dup) {
				System.out.println("Duplicates in thia array :  " + arr[i]);
			}
		}

	}

}