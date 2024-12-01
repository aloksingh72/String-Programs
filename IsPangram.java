//Dated 30/nov/2024
class IsPangram{
    public static void main(String[] args) {
        //String sentence = "thequickbrownfoxjumpsoverthelazydog";
			
		String sentence = "leetcode";

   		boolean res = isPangram(sentence);
			if(res == true){

					System.out.println("it is a  Pangram");
			}
		else{
					System.out.println("It is not a Panagram");
			}
			 	

    }


public static boolean isPangram(String sentence){
int[] freq = getFrequency(sentence);

		for(int i =0 ;i<freq.length;i++){


						if(freq[i] ==0){
									return false;
							}
		}
		return true;




}

    public static int[] getFrequency(String s){
		
		int[] freq = new int[26];
		for(int i =0;i<s.length();i++){
				char c = s.charAt(i);
	
			if(c>=65 && c<=90){
						freq[c-65]++;

				}
			else if (c>=97 && c<=122){
							freq[c-97]++;
					}
						
			}

		return freq;
       
    }

}
