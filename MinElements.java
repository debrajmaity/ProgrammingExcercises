public class MinElements {
	
	static class minvalues{
		static int x; //minimum
		static int y; //second minimum
	}
	
	public static void main(String args[]){

		getMinimumValues();
		System.out.println("Print the values:"+minvalues.x+" "+minvalues.y);

	}

	
	static void getMinimumValues(){

			int arr[]={17,35,4,7,5,6,9,11,12,14};
			boolean end=false;


			if(arr[0]<arr[1]){
				minvalues.x=arr[0];
				minvalues.y=arr[1];
			}else{
				minvalues.x=arr[1];
				minvalues.y=arr[0];
			}

			for(int i=2;i<arr.length;i++){
				if(arr[i]<minvalues.x){
						minvalues.y=minvalues.x;
						minvalues.x=arr[i];
					}else{
						if(arr[i]<minvalues.y){
							minvalues.y=arr[i];
						}
					}
			}
			
	}
}