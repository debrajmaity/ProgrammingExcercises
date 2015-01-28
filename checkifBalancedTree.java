public class checkifBalancedTree {


	static boolean isBalanced;

	public static void main(String arg[]) {

		node rootnode=BinaryTree.init(6);
		node n1=BinaryTree.AddLeftChild(rootnode,new node(4));
		node n2=BinaryTree.AddRightChild(rootnode,new node(8));

		node n3=BinaryTree.AddLeftChild(n1,new node(3));
		BinaryTree.AddRightChild(n1,new node(5)); 

		BinaryTree.AddLeftChild(n3,new node(7));
		BinaryTree.AddRightChild(n3,new node(10)); 

		BinaryTree.PrintBinaryTreeInorder(rootnode);

		checkifBalancedTree(rootnode);
			if(Result.isBalanced){
			System.out.println("isBalanced");
		}else{
			System.out.println("NotBalanced");
		};

	}

	static class Result{
		static int height;
		static boolean isBalanced;
	}

	static int checkifBalancedTree(node root){
		
		int heightLeftSubtree, heightRightSubtree;

		if(root==null){
			return 0;
		}else{

			heightLeftSubtree=checkifBalancedTree(root.leftsubtree)+1;
			heightRightSubtree=checkifBalancedTree(root.rightsubtree)+1;

			if(difference(heightLeftSubtree,heightRightSubtree)>1){
				//the tree is unbalanced so set the flag isBalance as fasle;
				Result.isBalanced=false;
			}else{
				Result.isBalanced=true;
			}

			return (heightLeftSubtree>heightRightSubtree)?heightLeftSubtree:heightRightSubtree;

		}	
	}


	static int difference(int h1,int h2){
		if(h1>h2){
			return h1-h2;
		}else{
			return h2-h1;
		}
	} 	
}