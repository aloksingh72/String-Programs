//ques-6 WAJP to take a String input and count all the vowel characters in the String.

class CountVowel{
	public static void main(String[] args){

	String s = "Hello world";

		//method callling
			countVowel(s);
	}
	public static void countVowel(String s){
					s= s.toLowerCase();
					int count =0;
				for(int i=0;i<s.length();i++){

					char c = s.charAt(i);
					if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u'){

								count++;
					}
		}

	System.out.println("the number of vowel is "+count);

	}

}