package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strin = "welocme to testleaf";
		String strout ="";
		char[] charArray = strin.toCharArray();
		for (int i=0; i<charArray.length; i++) {
			if (i%2==1) {
				strout = strout+Character.toUpperCase(charArray[i]);
			}
			else
				strout = strout+charArray[i];
		}
		System.out.println("Changed to Uppercase letter is :  "+strout);

	}

}