public class Test1{

	public static void main(String args[]){

		System.out.println(""+testfinally());
	}


	static int testfinally(){
		try{
			System.out.println("this is a test class!");
			//int d=1/0;
			return 1;
		}catch(Exception e){
			System.out.println("this is inside exception!");
			return -1;
		}finally {
			System.out.println("this is inside finally");

		}

		
	}
}