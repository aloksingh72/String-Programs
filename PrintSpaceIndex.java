//ques-8> WAJP to take a String input and print all the indexes where space characters are present in the String.

class PrintSpaceIndex{

	public static void main(String[] args){

		String s = "Mohan and Sohan";
	//method calling
	printSpaceIndex(s);

	}
//method declaration 
// mehtod to print space index
	public static void printSpaceIndex(String s){

		for(int i =0;i<s.length();i++){
				char c = s.charAt(i);
				if(c==' '){
						System.out.print(i+",");
				}
		}
	
	}

}