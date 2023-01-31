package com.datastructure.tree;

/*
                 3
                / \
               9   20
                  /  \
                 15   7
 */

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromInorderPostorderTraversal {
    public static void main(String[] args) {

        TreeNode node3, node9, node20, node15, node7;

        node9 = new TreeNode(9);
        node15 = new TreeNode(15);
        node7 = new TreeNode(7);
        node20 = new TreeNode(20,node15, node7);
        node3 = new TreeNode(3,node9,node20);

        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};


        //!Boundry Cases
        if (inorder == null || postorder == null || inorder.length != postorder.length) return;


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode ans = buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);

        AllTreeTraversal.inOrder(ans);

    }

    static TreeNode buildTree(int[] inOrder, int iStart, int iEnd,
                              int[] postOrder, int pStart, int pEnd,
                              Map<Integer, Integer> map){

        if (iStart > iEnd || pStart > pEnd) return null;

        //! Make root node
        TreeNode node = new TreeNode(postOrder[pEnd]);

        int inRoot = map.get(postOrder[pEnd]);
        int numsLeft = inRoot - iStart;

        node.left = buildTree(inOrder, iStart, inRoot-1,
                postOrder, pStart,pStart + numsLeft-1, map);
        node.right = buildTree(inOrder, inRoot+1  , iEnd,
                postOrder, pStart + numsLeft, pEnd-1, map);

        return node;

    }

}
