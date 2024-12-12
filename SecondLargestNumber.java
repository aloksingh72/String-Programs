//ques-18 Second largest Number in String:

class SecondLargestNumber{

	public static void main(String[] args){
		String s = "sjhtz8344";
	//method calling
	int res = secondLargestNumberInString(s);
	System.out.println(res);

	}
	public static int secondLargestNumberInString(String s){
	int largest = Integer.MIN_VALUE;
	int sec_largest = largest;
	for(int i =0;i<s.length();i++){
	  char c = s.charAt(i);
		if(c>='0' && c<='9'){

				int num = c-'0';
				if(num > largest ){

					sec_largest = largest;
					largest = num;
				}
				else if (num <largest && num >sec_largest){

					sec_largest = num;
				}
			}
}
		if(sec_largest == Integer.MIN_VALUE){

				return -1;
			}
		
		
return sec_largest;
	}

} 