package com.datastructure.tree;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        TreeNode node3, node9, node20, node15, node7;

        node9 = new TreeNode(9);
        node15 = new TreeNode(15);
        node7 = new TreeNode(7);
        node20 = new TreeNode(20,node15, node7);
        node3 = new TreeNode(3,node9,node20);

    }

//    static TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> map){
//        if (is > ie || ps > pe) return null;
//
//        TreeNode root = new TreeNode(postorder[pe]);
//        int inRoot = map.get(postorder[pe]);
//        int totalLeft = inRoot-is;
//
//        root.left = buildTree(inorder, is, inRoot-1, postorder, ps, ps+totalLeft-1, map);
//        root.right = buildTree(inorder, inRoot+1, ie, postorder, ps+totalLeft, pe-1, map);
//
//    }

}
