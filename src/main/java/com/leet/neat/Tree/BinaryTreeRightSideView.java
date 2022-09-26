package com.leet.neat.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        list.add(root.value);
        printRightView(root,0,list);
        return list;

    }

    void printRightView(TreeNode node, int level, List<Integer> list){

        if(node==null)
            return ;
        else if(list.size() == level){
            list.add(node.value);
        }

        printRightView(node.right,level+1,list);
        printRightView(node.left,level+1,list);


    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.right=new TreeNode(3);
        node.left=new TreeNode(2);
        node.left.right=new TreeNode(5);
        node.right.right=new TreeNode(4);
        BinaryTreeRightSideView binaryTreeRightSideView=new BinaryTreeRightSideView();
        binaryTreeRightSideView.rightSideView(node);
    }
}
