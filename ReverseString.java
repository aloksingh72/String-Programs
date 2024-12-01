import java.util.Scanner;

class ReverseString{
	public static void main(String[] args){

		String s1 = "Mohan and Sohan is here";

		reverseString(s1);
	

	}
public static void reverseString(String s){
					String rev = "";
				for(int i =s.length()-1;i>=0;i--){

				char c = s.charAt(i);
					rev = c+rev;
	
					

						System.out.print(rev);

				

		}
	}



}