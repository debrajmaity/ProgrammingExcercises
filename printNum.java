public class printNum{
	public static void main(String args[]){
		//find(12254);
		//System.out.print(f());
		System.out.println(f1(17));
	}


	static void find(int n){
		while(n>0){
			n=n/10;
			System.out.print(n%10);
		}
	}


	static int f() {
    int[] arr = new int[] {3, 7, 1, 11, 5};
    int i = 0, j = arr.length - 1;
    while(i <= j) {
        i++;
        if(i == j) {
            return arr[i];
        }
        j--;
    }
    return arr[j];
	}


	static int f1(int n) {
    int i = 0;
    int j = 1;
    while(j < n) {
        i += j;
        j++;
    }
    return i;
	}
}