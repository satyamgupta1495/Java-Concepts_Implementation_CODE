package com.datastructure.tree;

/*
                 3
                / \
               9   20
                  /  \
                 15   17
 */

public class AllTreeTraversal {
    public static void main(String[] args) {

        TreeNode node3, node9, node20, node15, node7;

        node9 = new TreeNode(9);
        node15 = new TreeNode(15);
        node7 = new TreeNode(7);
        node20 = new TreeNode(20,node15, node7);
        node3 = new TreeNode(3,node9,node20);

        inOrder(node3);
        System.out.println();
        preOrder(node3);
        System.out.println();
        postOrder(node3);
    }

    static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    static void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    static void postOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.val + " ");

        }
    }
}
