//ques11-> WAJP to take a String input and print sum of all the even numeric characters in the String.

class SumOfEvenNumeric{


	public static void main(String[] args){

			String s = "Hello23@singh6";
		//method calling
		sumOfEvenNumeric(s);
	}

	public static void sumOfEvenNumeric(String s){
		
		int esum = 0;
		for(int i =0;i<s.length();i++){
	
				char c = s.charAt(i);
			   if(c>='0' && c<='9'){
						int a = (int)(c-'0');
						if(a % 2 ==0){
								esum = esum +a;
						}
				 
			}
			
		}
	System.out.println(esum);
	}
}
 