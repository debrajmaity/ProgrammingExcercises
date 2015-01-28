class node{

		int data;
		node leftsubtree;
		node rightsubtree;
		node parent;

		node(int data){
			this.data=data;
			leftsubtree=null;
			rightsubtree=null;
			parent=null;
		}
	}