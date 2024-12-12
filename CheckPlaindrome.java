//ques13->WAJP to take a String input and check whether the String is a Palindrome String or not(without reversing).

class CheckPlaindrome{
	public static void main(String[] args){
	String s = "madam";
	//method calling
	if(isPlaindrome(s)){
			System.out.println("It is Plaindrome ");
		}
	else{
	System.out.println("It is not a plaindrome");
	}

	}
	public static boolean isPlaindrome(String s){
		for(int i =0;i<s.length()/2;i++){
			if(!(s.charAt(i) == s.charAt(s.length()-1-i))){

				return false;
			}
		}
return true;

	}

}