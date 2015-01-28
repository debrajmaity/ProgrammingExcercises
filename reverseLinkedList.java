public class reverseLinkedList {

	//reverse 
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

		//LinkedList lst=new LinkedList();
		//lst.data=1;
		//lst.next=null;
		//LinkedList header=null;

		add(new LinkedList(1));
		add(new LinkedList(2));
		add(new LinkedList(3));
		add(new LinkedList(4));
		add(new LinkedList(5));
		add(new LinkedList(6));

		printLinkedList(header);
		//reverse();
		reverseListWithoutRecursion();
		printLinkedList(header);

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


	static void printLinkedList(LinkedList header){
		LinkedList temp=header;
		while(temp!=null){
			System.out.print(temp.data);
			System.out.print(" ");
			temp=temp.next;
		}

		System.out.println(" ");
	}


	static void reverse(){
		LinkedList currentNode=header;
		LinkedList nextNode=currentNode.next;
		reverseList(currentNode,nextNode);
	}


	static void reverseList(LinkedList currentNode,LinkedList nextNode){

		if(nextNode.next==null){
			//the node pointer is at the last element
			nextNode.next=currentNode;
			header=nextNode;
			
		}else{
			//the node pointer is at the other elements
			reverseList(currentNode.next,nextNode.next);
			nextNode.next=currentNode;
			currentNode.next=null;
		}

		
	}

	static void reverseListWithoutRecursion(){

			LinkedList prevNode=header;
			LinkedList currentNode=header.next;
		    LinkedList nextNode=currentNode.next;

		    while(nextNode.next!=null){
		    	//prevNode=currentNode;
		    	currentNode.next=prevNode;
		    	prevNode=currentNode;
		    	currentNode=nextNode;
		    	nextNode=nextNode.next;

		    }

		    nextNode.next=prevNode;
		    header.next=null;
		    header=nextNode;


	}

}