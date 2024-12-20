class GetStringLength{

	public static void main(String[] args){

			String s = "hello Java";
		
				//method calling
			getStringLength(s);


	}
	//method declaration
	public static void  getStringLength(String s1){

				char[] a =s1.toCharArray();
				System.out.println("The length is "+a.length);
				

		}

}