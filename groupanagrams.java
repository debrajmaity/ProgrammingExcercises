import java.util.*;

public class groupanagrams{
	
	public static void main(String args[]){

		ArrayList<String> inputs=new ArrayList<String>();
		inputs.add("hello");
		inputs.add("aadd");
		inputs.add("lleho");
		inputs.add("dada");
		inputs.add("oell");
		inputs.add("aadd");
		inputs.add("lleo");
		inputs.add("dada");
		inputs.add("karsevak");
		inputs.add("aadda");
		inputs.add("sevakcar");
		inputs.add("daada");
		getAnagramsGroups(inputs);

	}


	static class anagramStrings implements Comparable<anagramStrings>, Comparator<anagramStrings>{

		private String agrms;

		anagramStrings(String agrms){
			this.agrms=agrms;
		}
		
		public int compareTo(anagramStrings a){
      		
      		if(anagrams.checkanagram(this.agrms,a.agrms)){
				return 0;
			}else{
				return 1;
			}
   		}

		public int compare(anagramStrings k1,anagramStrings k2){
			return k1.compareTo(k2);
		}
	}


	static Map<anagramStrings,ArrayList<String>> getAnagramsGroups(ArrayList<String> inputs){

		Map<anagramStrings,ArrayList<String>> mp=new TreeMap<anagramStrings,ArrayList<String>>();
		
		ArrayList<String> arr=new ArrayList<String>();

		for(String s:inputs){

			System.out.println(s);

			if(mp.isEmpty()){
				arr.add(s);
				mp.put(new anagramStrings(s),arr);
			}else{
				anagramStrings kk=new anagramStrings(s);
				if(mp.containsKey(kk)){
					arr=mp.get(kk);
					arr.add(s);
					mp.put(kk,arr);
				}else{
					arr=new ArrayList<String>();
					arr.add(s);
					mp.put(new anagramStrings(s),arr);
				}
			}
		}

		for (anagramStrings key: mp.keySet()) {
				System.out.println(mp.get(key));
		}
		return mp;
	}
}