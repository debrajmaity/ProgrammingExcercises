import java.util.*;
import java.io.*;

/**
@author: Debraj Maity
This program is to find and prints the largest and second largest compoundword present in a list which are made up of other smaller words present in the same list.
*/
public class FindLongestWords {

	//Static variables to store the desired output 
	public static String firstlongestword="";
	public static String secondlongestword="";
	public static int totalcount=0;
	
	public static void main(String arg[]) throws Exception{

		//The file path is given is taken from the argument
		if(arg.length==0){

			System.out.println("Input file missing! java FindLongestWords <inputfilename>");
			System.exit(0);

		}else if(arg.length==1){

			BufferedReader br=null;
			try{
				File file=new File(arg[0]);
				br = new BufferedReader(new FileReader(file));
				String line;
				ArrayList<String> strs=new ArrayList<String>();

				while ((line = br.readLine()) != null) {
			 
					strs.add(line);
				}
				
			   getLongestWords(strs);

			   //At this point the output variable should contain the required values.

			   System.out.println("firstlongestword: " + firstlongestword);
			   System.out.println("Secondlongestword: " + secondlongestword);
			   System.out.println("count: " + totalcount);

			}catch(Exception e){
			  System.out.println(e.getMessage());	
			}finally {
				br.close();
			}
		}else{
			System.out.println("Too many arguments!");
		}
		//End of the program.

	}


	//The below methods takes an arraylist of the words 
	//stores the listofwords in hashset for efficient search
	//Iterate through each word in the arraylist to check whether its a concatenation of words or a compoundword
	//If its a compoundword then
		//increment the totalcount
		//Check if the length of the firstlongestword is smaller than currentItem, 
				//assign firstlongestword to secondlongestword
				//assign currentItem to firstlongestword
		//else check if the length of the secondlongestitem is smaller than currenItem
				//assign currentItem to secondlongestitem
		
	public static void getLongestWords(ArrayList<String> listofwords){

	  	//Check if the list is empty, then return
	  	if(listofwords.isEmpty()){
	  		return;
	  	}

	  	//create a Hashset of words. It acts as dictionary for efficient searching of words.
	  	Set<String> wordset = new HashSet<String>(listofwords);

	  	for(String word:listofwords){
	  		
	  		if(isacompoundword(word,wordset,true)){
	  			totalcount++;
	  			if((firstlongestword).length()<word.length()){
	  				secondlongestword=firstlongestword;
	  				firstlongestword= word;
	  			}else if((secondlongestword).length()<word.length()){
	  				secondlongestword=word;
	  			}
	  		}
	  		
	  	}

	}


	//This method is used to check whether the currentword is a compundword. The word is split into part1 and part2 in all possible ways
	//1) Any compundword is part of words. So split the compoundword into prefix and suffix
	//2) Iterate through all different  prefix and suffix of the compoundword.
	//3) If prefix is a word present in the list of words , then check whether suffix is a compoundword by through step 1 
	//4) If both prefix and suffix are present, its a compoundword else not a compoundword.
	
	public static boolean isacompoundword(String currentWord, Set<String>wordset, boolean isThisCurrentWord){
		

		boolean status=false;
		String part1="";
		String part2="";
		
		if(isThisCurrentWord)
			wordset.remove(currentWord);

		//this is for the parts of original word of the originalItem
		if(wordset.contains(currentWord)){
			status=true;
		}else{
			for(int i=currentWord.length()-1;i>0;i--){
			
				part1=currentWord.substring(0,i);
				part2=currentWord.substring(i);
				
				//If the first part is present in the list as word, 
				//then recursively check whether part2 also a compoundword
				if(wordset.contains(part1)){
					if(isacompoundword(part2,wordset,false)){
						status=true;
						break;
					}
				}
			}
		}

		//if it the currentItem, add the word back to the set
		if(isThisCurrentWord)
			wordset.add(currentWord);

		return status;
	}




}