package binaryTree;

public class SumOfNodes {
	public static int sum;

	public static void main(String[] args) {
		SumOfNodes o = new SumOfNodes();
//		o.getSum(o.getTree());
	int sum1 =	o.getSum1(Node.getTree());
		System.out.println("Sum is : "+sum1);
	}

	private void getSum(Node root) {
		if (root == null)
			return;
		System.out.println(root.getVal());
		sum += root.getVal();
		getSum(root.getLeft());
		getSum(root.getRight());
	}

	private int getSum(Node root, int sum) {
		if (root == null)
			return 0;
		System.out.println(root.getVal());
		//sum += root.getVal();
		int left =getSum(root.getLeft(),sum);
		int right=getSum(root.getRight(),sum);
		
		return root.getVal()+left+right;
	}
	
	private int getSum1(Node root) {
		if (root == null)
			return 0;
		System.out.println(root.getVal());
		//sum += root.getVal();
		int left =getSum1(root.getLeft());
		int right=getSum1(root.getRight());
		
		return root.getVal()+left+right;
	}
	
}
