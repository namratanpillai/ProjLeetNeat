package com.leet.neat.Tree;

import java.util.Scanner;

public class BinaryTree {

    public TreeNode createTree(){
        TreeNode root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new TreeNode(data);
        System.out.println("Enter the left for element "+data);
        root.left=createTree();
        System.out.println("Enter the right for element "+data);
        root.right=createTree();
        return root;
    }

    public void inOrder(TreeNode root){
        if(root==null)
            return;

        inOrder((root.left));
        System.out.println(root.value);
        inOrder(root.right);
    }
}
