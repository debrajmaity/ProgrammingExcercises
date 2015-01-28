public class MultiStack{

	private static final int MAX_CAP=10;

	private static int[] obj=new int[MAX_CAP]; 

	private static int stackpointer1=-1;
	private static int stackpointer2=(MAX_CAP/3);
	private static int stackpointer3=(2*(MAX_CAP/3));

	public static void main(String args[]){
		initialize(1);
		try{push(1,1);
			push(1,1);
			push(1,1);
			push(1,1);
			pop(1);
			pop(1);
			pop(1);
			pop(1);
			push(1,1);

		}catch(Exception e){
			System.out.println(""+e.getMessage());
		}
	}

	static void initialize(int whichStack){
		if(whichStack==1)stackpointer1=0;
		if(whichStack==2)stackpointer2=(MAX_CAP/3)+1;
		if(whichStack==3)stackpointer3=(2*(MAX_CAP/3))+1;
	}

	static void push(int whichStack, int data) throws Exception{
		if(isStackEmpty(whichStack)){
			initialize(whichStack);
		}
		
		if(!isStackFull(whichStack)){

			//First stack 
			if(whichStack==1){
				obj[stackpointer1]=data;
				stackpointer1++;
			
			}else if(whichStack==2){
				obj[stackpointer2]=data;
				stackpointer2++;

			}else if(whichStack==3){
				obj[stackpointer3]=data;
				stackpointer3++;
			}

			System.out.println("Push data to stack:"+whichStack+" "+data);
		}else{
			throw new Exception("StackOverFlow");
		}
	}

	static int pop(int whichStack) throws Exception{
		
		int data=-1;
		//First stack 
		if(whichStack==1){
			stackpointer1--;
			if(!isStackEmpty(whichStack)){
				data=obj[stackpointer1];
			}
		}else if(whichStack==2){
			stackpointer2--;
			if(!isStackEmpty(whichStack)){
				data=obj[stackpointer2];
			}

		}else if(whichStack==3){
			stackpointer3--;
			if(!isStackEmpty(whichStack)){
				data=obj[stackpointer3];
			}
		}

		if(isStackEmpty(whichStack)){
				throw new Exception("StackEmpty");
		}

		System.out.println("Poped data from stack:"+whichStack+" "+data);
		return data;
	}

	static boolean isStackFull(int whichStack){
	
		if(whichStack==1){
			if(stackpointer1==(MAX_CAP/3)+1)
				return true;
			else
				return false;
		}if(whichStack==2){
			if(stackpointer2==(2*(MAX_CAP/3))+1)
				return true;
			else
				return false;
		}if(whichStack==3){
			if(stackpointer3==MAX_CAP)
				return true;
			else
				return false;
		}

		return false;
	}


	static boolean isStackEmpty(int whichStack){
	
		if(whichStack==1){
			if(stackpointer1==-1)
				return true;
			else
				return false;
		}if(whichStack==2){
			if(stackpointer2==(MAX_CAP/3))
				return true;
			else
				return false;
		}if(whichStack==3){
			if(stackpointer3==(2*(MAX_CAP/3)))
				return true;
			else
				return false;
		}

		return false;
	}

}