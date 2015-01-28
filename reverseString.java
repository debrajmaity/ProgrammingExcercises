public class reverseString{

	public static void main(String args[]){
		System.out.println(""+reverse("This is a test"));
	}

	static String reverse(String input){
		String output="";		//Output variable
		String temp="";			//Reset the temp variable
		char c=' ';
		for(int i=input.length()-1;i>=0;){

			c=input.charAt(i);

			//System.out.println(""+c);
			//check if there space encountered and according add the temp to output
			if(c==' '){
				if(temp!=""){
					if(output==""){
						output=temp;
					}else{
						output=output+' '+temp;
					}	//add temp to the output
					//System.out.println(output);
					temp="";		//Reset the temp variable
				}
			}else{
				temp=c+temp;
			}

			i--;
		}

		output=output+' '+temp;
		return output;
	}
}