package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "*** Welcome to TestLeaf *** 14-08-2021";		
		int  letter = 0, space = 0, num = 0, specChar = 0;
		char[] charArr = str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			if (Character.isLetter(charArr[i])) {
				letter = letter+1;
			}
			else if (Character.isDigit(charArr[i])) {
				num =num+1;
			}
			else if (Character.isSpaceChar(charArr[i])) {
				space = space+1;
			}
			else 
				specChar+=1;
		}	
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specChar);

}

}