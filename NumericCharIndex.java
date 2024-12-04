//ques7->WAJP to take a String input and print all the indexes where numeric characters are present in the String.

class NumericCharIndex{

	public static void main(String[] args){

			String s = "alok70si5ngh";
		//method calling
		System.out.println("The index where numeric character is available");
		numericCharIndex(s);


}
	
	
	public static void numericCharIndex(String s){
	/*
		char[] a = s.toCharArray();

		for(int i =0;i<a.length;i++){
					
				if(a[i]>=48 && a[i]<=57)
			         System.out.print(i+",");


			}
*/
	


	for(int i =0;i<s.length();i++){
		char c = s.charAt(i);
		if(c >='0' && c<='9'){
				System.out.print(i+",");

		}

	}
}

}