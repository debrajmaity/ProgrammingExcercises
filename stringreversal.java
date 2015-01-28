public class stringreversal{
	
	public static void main(String args[]){
		reverseString("Hello I am fine");
	}


	static void reverseString(String input){
		input=reverse(input,input.length()-1);
		System.out.println("Reversed String: "+input);
	}

	static String reverse(String input,int i){
		if(i==0){
			return ""+input.charAt(i);
		}else{
			input=input.charAt(i)+reverse(input,i-1);
			return input;
		}
	}

}