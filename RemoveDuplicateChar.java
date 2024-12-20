//ques14-> WAJP to take a String input and remove all the duplicate characters and store in another String.


class RemoveDuplicateChar{

	public static void main(String[] args){
		String s = "helllo";
	//method calling
	removeDuplicate(s);
	String res = removeDuplicate(s);
	System.out.println(res);
	}
	//method declaration
	public static String removeDuplicate(String s){
		int[] ch = new int[256];
	StringBuilder ans = new StringBuilder();
	for(char c :s.toCharArray()){
		if(ch[c] ==0){
			ans.append(c);
		ch[c]++;
		}

	}
return ans.toString();



	}


	
}