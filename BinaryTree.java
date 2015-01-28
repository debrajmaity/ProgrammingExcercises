class BinaryTree{
	

	public static void main(String arg[]) {

		node rootnode=init(6);
		node n1=AddLeftChild(rootnode,new node(4));
		node n2=AddRightChild(rootnode,new node(8));

		AddLeftChild(n1,new node(3));
		AddRightChild(n1,new node(5)); 

		AddLeftChild(n2,new node(7));
		AddRightChild(n2,new node(10)); 

		PrintBinaryTreeInorder(rootnode);
	}


	static node createBinaryTree(){

		node rootnode=init(6);
		node n1=AddLeftChild(rootnode,new node(4));
		node n2=AddRightChild(rootnode,new node(8));

		AddLeftChild(n1,new node(3));
		AddRightChild(n1,new node(5)); 

		AddLeftChild(n2,new node(7));
		AddRightChild(n2,new node(10));

		return rootnode; 

	}
	
	static node init(int rootdata){
		
		node root=new node(rootdata);
		return root;
	}

	static node AddLeftChild(node root, node leftsubtree){

		root.leftsubtree=leftsubtree;
		leftsubtree.parent=root;
		return leftsubtree;
	}

	static node AddRightChild(node root, node rightsubtree){

		root.rightsubtree=rightsubtree;
		rightsubtree.parent=root;
		return rightsubtree;
	}
	
	static void PrintBinaryTreeInorder(node root){

		if(root!=null){
			
			PrintBinaryTreeInorder(root.leftsubtree);
			System.out.print(root.data+" ");
			PrintBinaryTreeInorder(root.rightsubtree);
			//System.out.println("");
		}
	}

}