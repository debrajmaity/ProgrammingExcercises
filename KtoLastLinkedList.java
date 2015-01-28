public class KtoLastLinkedList{
	
	static LinkedList header;

	//Data Structure for LinkedList
	static class LinkedList{
			
			int data;
			LinkedList next;

			LinkedList(int data){
				this.data=data;
			}
	}

	public static void main(String args[]){
		
		add(new LinkedList(1));
		add(new LinkedList(2));
		add(new LinkedList(3));
		add(new LinkedList(4));
		add(new LinkedList(5));
		add(new LinkedList(6));
		add(new LinkedList(7));
		add(new LinkedList(8));
		add(new LinkedList(9));
		add(new LinkedList(10));
		add(new LinkedList(11));
		add(new LinkedList(12));

	}

	static void add(LinkedList node){
		
		//LinkedList temp=header;

		if(header!=null){
			LinkedList temp=header;
			while(temp.next!=null){
			temp=temp.next;
			}
		
			temp.next=node;
			node.next=null;
		}else{
			header=node;
		}

		//return header;
	}	

	static int KtoLastLinkedList(LinkedList head,int k){
		int val=0;

		if(head.next==null){
			//System.out.print(head.data);
			return 1;
		}else{
			val=KtoLastLinkedList(head.next,k);
			if(val==k){
				System.out.println(head.data);
				return val;
			}
			return val+1;
		}
	}
}