public class IsAnagram{


	
// main satements
	public static void main(String[] args){
	String s = "silen";
	String t = "listen";
	
	boolean res = isAnagram(s,t);

System.out.println(res);
		}
//method to check is anaagram
	public static boolean isAnagram(String s,String t){

			int[] freq1= getFrequency(s);
			int[] freq2 = getFrequency(t);

			for(int i =0; i<freq1.length;i++){
						if(freq1[i] != freq2[i]){
							return false;	
						}

			}
	return true;
	
	}

	public static int[] getFrequency(String s1){
	
		int[] freq = new int[26];

		for(int i =0;i<s1.length();i++){
			char c = s1.charAt(i);
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