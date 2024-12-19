//ques15-> WAJP to take a String input and count total number of words in the String(Without using split method)


class CountTotalWords{
	
	public static void main(String[] args){

		String s = "Mohan and sohan are best friend";
		//method calling
		int res = countTotalWords(s);
	System.out.println(res);
	}
	//method declarations
	
	public static int countTotalWords(String s){
			int count  =0;
	for(int i =0;i<s.length();i++){

		char c = s.charAt(i);
		if((i==0 && c!=' ') || (c!=' ' && s.charAt(i-1) ==' ')  ){

			count++;
	
			}
		}
return count;
	}
}