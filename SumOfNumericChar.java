//ques10-> WAJP to take a String input and print the sum of all the numeric characters in the String.


class SumOfNumericChar{

	public static void main(String[] args){

		String s = "he7llo3wor4ld5";
		//method callling
		sumOfNumericChar(s);
	}
	public static void sumOfNumericChar(String s){

		int sum =0;

		for(int i =0;i<s.length();i++){
				
				 char c = s.charAt(i);
				if(c>='0' && c<='9'){
						sum = sum +(int)(c-'0');
				}
					
		}

	System.out.println(sum);
	}
}