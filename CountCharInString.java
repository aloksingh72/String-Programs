//ques-3 WAJP to take a String input and count all the characters without spaces in the String.


class CountCharInString{

	public static void main(String[] args){
			String s = "Hello World   jav787#sa";

		//method calling
		countCharInString(s);

	}
	public static void countCharInString(String s1){

			int count =0;
		for(int i =0;i<s1.length();i++){
				char c = s1.charAt(i);
				//if(c>=97 && c<=122)
					//	count++;

			//else if (c>= 65 && c<=90)
				//	count++;

			if(!(c==' ')){
				count++;
			}

		}
		System.out.println("the number of character in String without Spaces "+count);
		
	

	}


}