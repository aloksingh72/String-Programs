//ques-4 WAJP to take a String input and count all the characters(excluding any special characters).

class CountCharExcludeSpecialChar{
	public static void main(String[] args){
			String s="Aa@$7e";

		//method calling
	countCharExcludeSpecialChar(s);


	}
//count char method 
	public static void countCharExcludeSpecialChar(String s){
				int count =0;

			for(int i =0;i<s.length();i++){

				 char c = s.charAt(i);
					
					if( (c >=97 && c<=122) || (c>=65 && c<=90) ){
								
							count++;	
				}	
						
			}

		System.out.println("the count of character excepting special character"+count);

		}

}
