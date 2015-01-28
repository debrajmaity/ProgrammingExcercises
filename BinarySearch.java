public class BinarySearch {
	
	public static void main(String args[]){

		int[] arr={12,2,34,5,6,7,8,22};
		System.out.println("search result:"+binarysearch(arr,9,0,7));
	}


	static int binarysearch(int arr[], int num,int start, int end){

		if(start<end){


			int middle=(start+end)/2;

			if(num==arr[middle]){
				return middle;
			}else if(num<arr[middle]){
				return binarysearch(arr,num,start,middle);
			}else{
				return binarysearch(arr,num,middle+1,end);
			}


		}else
			return -1;
	}




}