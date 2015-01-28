public static checkifBalancedTree {

	public static void main(String args[]){

	}

	static class Node{
		int data;
		Node left;
		Node right;
	}

	public int checkifBalancedTree(Node root){
		
		int heightLeftSubtree, heightRightSubtree;

		if(root==null){
			return 0;
		}else{

		}

		heightLeftSubtree=checkifBalancedTree(root.left)+1;
		heightRightSubtree=checkifBalancedTree(root.right)+1;

		if(heightRightSubtree>heightLeftSubtree){
			return heightRightSubtree;
		}else{
			return heightLeftSubtree;
		}	
	}	
}