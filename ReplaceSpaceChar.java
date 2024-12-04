//ques-9 WAJP to take a String input and replace all the space characters from _ in the String.
//a)By using replace() method
//b)Without using replace() method


import java.util.Scanner;
class ReplaceSpaceChar{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();

		//method calling
		//replaceUsingReplaceMthod(s);
		replaceWithoutReplaceMethod(s);
	}

	//using replace method 
	public static void replaceUsingReplaceMthod(String s){
			s = s.replace(' ','_');
		System.out.println(s);
				
		}

	//without using replace method 
	public static void replaceWithoutReplaceMethod(String s ){

			char[] a = s.toCharArray();
		 for(int i =0;i<a.length;i++){
						if(a[i] ==' '){
							a[i] = '_';
						}
				}

		String res = new String(a);
	System.out.println(res);
	
	}
} 