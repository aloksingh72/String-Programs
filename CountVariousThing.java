//ques 5.->WAJP to take a String input and count all the space characters, uppercase, lowercase, numeric, special characters in the String.

class CountVariousThing{
//main method 
	public static void main(String[] args){
		String s = "A@7a Singh";
		//method calling
		
		countVariousThing(s);
	}
//method declaration
//count the things
	public static void countVariousThing(String s){
		int space_count =0;
		int uppercase_count=0;
		int lowercase_count =0;
		int specialchar_count =0;
		int number_count=0;

			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
		
					if(c>=97 && c<=122)
							lowercase_count++;
					else if(c>=65 && c<=90)
							uppercase_count++;
					else if(c == ' ')
					    space_count++;
					else if(c>='0' && c<=57)
						number_count++;
					else
						specialchar_count++;
						
							
		}

	System.out.println("space_count"+space_count);
	System.out.println("number_count"+number_count);
	System.out.println("uppercase_count"+uppercase_count);
	System.out.println("lowercase_count"+lowercase_count);
	System.out.println("specialchar_count"+specialchar_count);
	System.out.println("specialchar_count"+specialchar_count);

	
	}

}


