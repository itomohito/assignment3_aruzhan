class Main{
    public static void main(String[] args)  {
        BST bst = new BST();
        bst.insert(52);
        bst.insert(8);
        bst.insert(15);
        bst.insert(30);
        bst.insert(82);
        bst.insert(55);
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();
        System.out.println("\nThe BST after Delete 30(leaf node):");
        bst.deleteKey(30);
        bst.inorder();
        System.out.println("\nThe BST after Delete 82 (node with 1 child):");
        bst.deleteKey(82);
        bst.inorder();
        System.out.println("\nThe BST after Delete 55 (Node with two children):");
        bst.deleteKey(55);
        bst.inorder();
        boolean ret_val = bst.search (50);
        System.out.println("\nKey 50 found in BST:" + ret_val );
        ret_val = bst.search (30);
        System.out.println("\nKey 30 found in BST:" + ret_val );
    }
}
