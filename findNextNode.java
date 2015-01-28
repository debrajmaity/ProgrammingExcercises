public class findNextNode{
	
	public static void main(String args[]){
		BinaryTree.createBinaryTree();
	}

	public node NextNode(node inputnode){
		if(inputnode==null){
			return null;
		}else{

			//if the input has right subtree then the next element will be leftmost node of the subtree
			if(inputnode.rightsubtree!=null){
				return findtheleftmost(inputnode.rightsubtree);
			}else{
				//if the input has no right end then go back to parent 
				node p=inputnode;
				node x=p.parent;

				while(x!=null && x.left!=p){
					p=x;
					x=x.parent;
				}
				return x;
			}
		}
	}


	public node findtheleftmost(node rightnode){
		while(rightnode.left!=null){
			rightnode=rightnode.left;
		}
		return rightnode;
	}

}



