import java.util.*;

public class anagrams{
	public static void main(String args[]){
			System.out.println(checkanagram("aaddoo","adoado "));
	}

	static boolean checkanagram(String input1, String input2){

		if(input1==null||input2==null||(input1.length()!=input2.length())){
			return false;
		}else{
			HashMap<Character,Boolean> checker=new HashMap<Character,Boolean>(input1.length());
			
			for(int i=0;i<input1.length();i++){
				Character c=input1.charAt(i);
				//System.out.println("i="+i+" "+ c);
				if(checker.containsKey(c)){
					boolean value=checker.get(c);
					
					value=flip(value);
					//System.out.print("i="+i+ value);
					checker.put(c,value);
				}else {
					checker.put(c,false);
				}
			}

			for(int i=0;i<input2.length();i++){
				Character c2=input2.charAt(i);
				if(checker.containsKey(c2)){
					boolean value=checker.get(c2);
					value=flip(value);
					checker.put(c2,value);
				}else{
					return false;
				}
			}

			for (Character key: checker.keySet()) {
				if(!checker.get(key)){
					return false;
				}
					
			}

			return true;

			
		}
}


	static boolean flip(boolean val){
		return (val)?false:true;
	}
}