package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "i am durgadevi from testleaf aug batch";
		String[] strArr = str.split(" ");
		String revStr = "";
		for (int i = 0; i < strArr.length; i++) {
			if ((i + 1) % 2 == 0) {
				String reverse = "";
				for (int j = strArr[i].length() - 1; j >= 0; j--) {
					reverse = reverse + strArr[i].charAt(j);
				}
				revStr = revStr + reverse;
			} else {
				revStr = revStr + strArr[i];
			}
			revStr = revStr + " ";
		}
		System.out.println("Reversed string of even words are : " + revStr);

	}

}