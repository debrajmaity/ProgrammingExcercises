import java.util.Arrays;

//check whether two strings are permutation of each other
public class permutationString{
	
	public static void main(String args[]){
		boolean res=isPermutation("supera","pusare");
		if(res)System.out.println("true");
		else System.out.println("false");
	}

	static boolean isPermutation(String a,String b){
		char[] ch1=new char[a.length()];
		char[] ch2=new char[b.length()];
		a.getChars(0,a.length(),ch1,0);
		b.getChars(0,b.length(),ch2,0);

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println(ch1);
		System.out.println(ch2);

		return Arrays.equals(ch1,ch2);
	}
}