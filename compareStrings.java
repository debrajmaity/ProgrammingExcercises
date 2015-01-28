import java.util.Arrays;

public class compareStrings{
	
	public static void main(String args[]){

		System.out.println(""+compareStrings("hello","elloh"));
	}

	static boolean compareStrings(String input1, String input2){
		
		if(input1==null || input2 == null){
			return false;
		}
		
		char[] in1=input1.toCharArray();
		char[] in2=input2.toCharArray();
		Arrays.sort(in1);
		Arrays.sort(in2);

		if(Arrays.equals(in1,in2)){
			return true;
		}else{
			return false;
		}
	}
}