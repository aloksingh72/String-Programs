//ques -WAJP to take a String input and count all numeric characters in the String

class CountNumericCharInString{

	public static void main(String[] args){

		String s = "aloksingh36757gmail";

		//method calling
		countNumericCharInString(s);
	}

public static void countNumericCharInString(String s1){

		int count = 0;
		for(int i =0;i<s1.length();i++){
				char c = s1.charAt(i);


					if(c>='0' && c<='9'){
								count++;
						}
			}

	System.out.println("the number of numeric character in String is "+count);


		}


}