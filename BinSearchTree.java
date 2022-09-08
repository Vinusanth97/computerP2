/* Class BinSearchTree */
 class BinSearchTree
 {
     private BinTreeNode root;
 
     public BinSearchTree()
     {
         root = null;
     }
     
     public boolean isEmpty()
     {
         return root == null;
     }
     
     public void insert(int val)
     {
         root = insert(root, val);
     }

     private BinTreeNode insert(BinTreeNode btnode, int val)
     {
         /* write your code here */
		if(btnode==null)
		 {
			 btnode=new BinTreeNode(val);
		 }
		else
		 {
			 if(val<=btnode.getVal())
				 btnode.leftChild=insert(btnode.leftChild,val);
			 else
				 btnode.rightChild=insert(btnode.rightChild,val);
			 
		 }
		
         return btnode;
		 
     }
     
     public void delete(int k)
     {
         if (isEmpty())
             System.out.println("Tree is Empty");
         else if (search(k) == false)
             System.out.println("Sorry "+ k +" is not there in the tree");
         else
         {
             root = delete(root, k);
             System.out.println(k+ " is deleted");
         }
     }

     private BinTreeNode delete(BinTreeNode root, int k)
     {
         /* write your code here */
         return root;
     }
     
     public int countNodes()
     {
         return countNodes(root);
     }
     
     private int countNodes(BinTreeNode r)
     {
         if (r == null)
             return 0;
         else
         {
             int c = 1;
             c += countNodes(r.getLeftChild());
             c += countNodes(r.getRightChild());
             return c;
         }
     }
     
     public boolean search(int val)
     {
         return search(root, val);
     }
     
     private boolean search(BinTreeNode r, int val)
     {
         boolean result = false;

         /* write your code here */
		 if(r!=null)
		 {
			 if(r.getVal()==val)
				 return result=true; 
			 else if(r.getVal()>val)
				 return search(r.leftChild,val);
			 else
				 return search(r.rightChild,val);
			 
			 
		 }

         return result;
     }
	 public int FindMax()
     {
         return FindMax(root);
     }
	 public int FindMin()
	 {
		 return FindMin(root);
	 }
	 //Find Maxium
	 int FindMax(BinTreeNode n)
	 {
		 if(n.rightChild==null)
			 return(n.getVal());
		 
		 else
			return FindMax(n.rightChild);
	 }
	 //Find Minimam
	 int FindMin(BinTreeNode n)
	 {
		 if(n.leftChild==null)
			 return(n.getVal());
		 
		 else
			 return FindMin(n.leftChild);
		 
	 }
     
     public void inorder()
     {
         inorder(root);
     }

     private void inorder(BinTreeNode r)
     {
         if (r != null)
         {
             inorder(r.getLeftChild());
             System.out.print(r.getVal() +" ");
             inorder(r.getRightChild());
         }
     }
     
     public void preorder()
     {
         preorder(root);
     }

     private void preorder(BinTreeNode r)
     {
         if (r != null)
         {
             System.out.print(r.getVal() +" ");
             preorder(r.getLeftChild());             
             preorder(r.getRightChild());
         }
     }
     
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(BinTreeNode r)
     {
         if (r != null)
         {
             postorder(r.getLeftChild());             
             postorder(r.getRightChild());
             System.out.print(r.getVal() +" ");
         }
     }     
 }
