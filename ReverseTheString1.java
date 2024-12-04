//ques12-> WAJP to take a String input and reverse the String.


class ReverseTheString1{

	public static void main(String[] args){
		String s = "alok";
			//method calling
		reverseTheString(s);
		
	}

	public static void reverseTheString(String s){
				
	/* //method -1
			String rev ="";
			for(int i=s.length()-1;i>=0;i--){
				char c = s.charAt(i);
				
				rev = rev+c;
			}
	*/
	//method-2
	String rev = "";
	for(int i =0;i<s.length();i++){

		char c = s.charAt(i);
			rev = c+rev;
		}

		System.out.println("The rev is: "+rev);
	}

}