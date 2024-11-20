package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
    	if(bt.empty())
    		return 0;
    	bt.find(Relative.Root);
    	return traverse(bt);
    	
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
    }
    public static <T> int traverse(BT<T> bt) {
    	int i=0;
    	if(bt.isLeaf()) {
    	i++;
    	return i;}
    	else {
    		    if(bt.current.left!=null) {
    			bt.find(Relative.LeftChild);
    			i+=traverse(bt);
    			bt.find(Relative.Parent);}
    			if(bt.current.right!=null) {
    				bt.find(Relative.RightChild);
        			i+=traverse(bt);
        			bt.find(Relative.Parent);
    			}
    			
    			
    	}
    	return i;
    }
}