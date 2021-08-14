package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcOme tO testleaf";
		char[] charArr = str.toCharArray();
		int count=0;
		for (int i=0; i<charArr.length; i++) {
			if (charArr[i] == 'O') {
					count = count+1;
			}
	}
		System.out.println("Number of occureneces of character O is "+count);

}
}
