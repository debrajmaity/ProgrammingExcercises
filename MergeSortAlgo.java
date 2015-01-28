public class MergeSortAlgo{
	
	public static void main(String arg[]){

			int[] a={1,2,3,4,5,6,7,8};
			int[] b=new int[8];
			MergeSort(a,b,0,8);
			System.out.println(a);
	}



	static void MergeSort(int[] a,int[] b, int startIndex, int endIndex){

			int q=(startIndex+endIndex)/2;

			if(q<1){

				return;

			}else{

				MergeSort(a,b,startIndex,q-1);
				MergeSort(a,b,q,endIndex);
				Merge(a,b,startIndex,q,endIndex);
			}


	}


	static void Merge(int[] a,int[] b, int start, int q, int end){

			int i=start;
			int j=q;
			for(int k=start;k<end;){
				if(a[i]<a[j]){
					b[k]=a[j];
					b[k+1]=a[i];
				}else{
					b[k]=a[i];
					b[k+1]=a[j];
				}
				k=k+2;
			}

			for(i=start;i<end;i++){
				a[i]=b[i];
			}

	}
}