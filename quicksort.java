
import java.io.*;
import java.util.Arrays;

/*
This program has been implemented by Debraj Maity

*/

public class quicksort {
	
	
    static void quicksort(int[] A, int p, int r) throws Exception {
    		if(p<r){

    		int p1;  //first Pivot
    		int p2; //second Pivot
    		if (A[p]<A[r]){
    			p1=A[p];
    			p2=A[r];
    		
    		}else{
    			p1=A[r];
    			p2=A[p];
    		
    		}		     		
    		
    		int flag=0;
    		int temp=-1;
    		int leftinbetweenpos=p+1;
    		int rightunexaminedpos=r-1;
    		
    		for(int j=p+1;j<=r-1;){
    			
    			
    			if(A[j]<p1){
    				
    				//If the element A[j] is less than p1 then swap the element with left most inbetween element
    				
    				temp=A[leftinbetweenpos];
    				A[leftinbetweenpos]=A[j];
    				A[j]=temp;
    				leftinbetweenpos++;
    				
    				
    			}else if(A[j]>p2){
    			
    				//If the element A[j] is greater than p2 then swap the element with right most unexamined element
    				temp=A[rightunexaminedpos];
    				A[rightunexaminedpos]=A[j];
    				A[j]=temp;
    				rightunexaminedpos--;
    				
    				flag=1;  //setting the flag so that the loop doesn't increment
    				
    			
    			}else if(A[j]>=p1 && A[j]<=p2){
    				//do nothing
    			}
    			
    			if(flag==0)
    				j++;
    			
    			if(rightunexaminedpos<j)
    				break;
    		}
    			

    		
    		A[p]=p1;
    		A[r]=p2;
    		
    		temp=A[leftinbetweenpos-1];
    		A[leftinbetweenpos-1]=A[p];
    		A[p]=temp;
    		
    		temp=A[rightunexaminedpos+1];
    		A[rightunexaminedpos+1]=A[r];
    		A[r]=temp;
    
    		
    		quicksort(A, p,leftinbetweenpos-2);
    		quicksort(A,rightunexaminedpos+2,r);
    		if(p1!=p2){
    			quicksort(A,leftinbetweenpos,rightunexaminedpos);
    		}
    		
    		}
    		
    }

   

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(args[0]);
        
       
        	int[] A= new int[n];
        
       		//int[] A={7,3,4,8,5,9,20,19,10,11,15,17,14,1,6,12};
        	
        
      	 	 for (int i = 0; i < n; i++) {
         		   A[i] = n-i;
      	 	 }
        
        	//System.out.println("Initial Array:"+ Arrays.toString(A));
			long start = System.currentTimeMillis();
       		quicksort(A, 0, n-1);
			long last = System.currentTimeMillis();
			
			
			for (int j = 0; j < A.length-1; j++) {
            	if(A[j] > A[j+1]) {
				 System.out.println("Sorting failed");
			 	return;
	   	 	}}
	   	 	
			//System.out.println("Sorted Array:"+ Arrays.toString(A));	//A[p]
			System.out.println("Success! Total time taken: "+(long)(last-start)+ " milliseconds");
        
     
    }
}