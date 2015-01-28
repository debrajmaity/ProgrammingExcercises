import java.util.Arrays;

//check whether two strings are rotation of each other

public class rotationString{
	
	public static void main(String args[]){

		boolean res=isSubstring("supera","erasup");
		if(res)System.out.println("true");
		else System.out.println("false");
	}



	static boolean isSubstring(String a,String b){
		
		char[] ch1=new char[a.length()];
		char[] ch2=new char[b.length()];
		a.getChars(0,a.length(),ch1,0);
		b.getChars(0,b.length(),ch2,0);
		boolean res=true;

		if(isPermutation(ch1,ch2)){
			a.getChars(0,a.length(),ch1,0);
			b.getChars(0,b.length(),ch2,0);
			int setpointer1=0;
			int setpointer2=0;

			int i=ch1.length-1;
			while(i>=0){
				
				if(ch1[0]==ch2[i]){
					setpointer2=i;
					break;
				}
				i--;
			}

			System.out.println(setpointer2);
		
			for(i=0;i<ch1.length;i++){

				System.out.println(ch1[setpointer1]+"=="+ch2[(setpointer2%ch2.length)]);
				if(ch1[setpointer1]!=ch2[(setpointer2%ch2.length)]){
					res=false;
				}
				setpointer1++;
				setpointer2++;
			}
		}else{
			res=false;
		}
		return res;
	}

	static boolean isPermutation(char[] ch1,char[] ch2){
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1,ch2);
	}
}