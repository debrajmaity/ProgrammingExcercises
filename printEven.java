public class printEven{
	
	public static void main(String args[]){
		printEvenNumbers(10);
	}

	static void printEvenNumbers(int n){
		int i=2;
		
		while(i<=n){

			System.out.println(i);
			i=i+2;
		}
	}
}