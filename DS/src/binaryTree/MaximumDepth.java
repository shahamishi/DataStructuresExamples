package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepth {
public List<Integer> lst = new ArrayList<Integer>();
List<Integer> curList = new ArrayList<Integer>();
List pathlist = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MaximumDepth().maxDepth(Node.getTree()));
		System.out.println(new MaximumDepth().maxDepthSum(Node.getTree()));
	}
	private int maxDepth(Node root){
		if(root==null) return 0;
		
		int left = maxDepth(root.getLeft());
		int right = maxDepth(root.getRight());
		
		return 1+ Math.max(left, right);
	}
	
	private int maxDepthSum(Node root){
		if(root==null) return 0;
		
		int left = maxDepthSum(root.getLeft());
		int right = maxDepthSum(root.getRight());
		
		return root.getVal()+ Math.max(left, right);
	}
	
	private int hasSum(Node root, int num){
		if(root==null) return 0;
		
		int left = maxDepthSum(root.getLeft());
		int right = maxDepthSum(root.getRight());
		
		return root.getVal()+ Math.max(left, right);
	}
	
	
	 boolean hasPathSumBert(final Node node, final int sum) {
        // return true if we run out of tree and sum==0
        if (node == null) { // empty tree
               // choose one:
               return (sum == 0);
               // return false;
        }
        curList.add(node.getVal());

        if (node.getLeft() == null && node.getRight() == null) { // leaf
               if (sum - node.getVal() == 0) {
                     pathlist.add(new ArrayList<Integer>(curList));
                     return true;
               }

        }

        if (sum <= node.getVal()) { // sum used up
               return false;
        } else { // try children
               boolean left = false, right = false;
               if (node.getLeft() != null) {
                     left = hasPathSumBert(node.getLeft(), sum - node.getVal());
               }

               if (node.getRight() != null) {
                     right = hasPathSumBert(node.getRight(), sum - node.getVal());
               }

               curList.remove(new Integer(node.getVal()));

               return left || right;

        }
 }
}
