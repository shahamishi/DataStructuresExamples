package binaryTree;

import java.util.HashMap;
import java.util.Map;

public class CountNodesOnEachLevel {

	public static void main(String[] args) {
		Node root = Node.getTree();
		Map<Integer, Integer> levelCount = new HashMap<Integer, Integer>();
		int maxCount = 0;
		int levelWithMaxNode = 0;

		getCount(levelCount, 0, root);

		for (Map.Entry<Integer, Integer> entryMap : levelCount.entrySet()) {
			System.out.println("The number of nodes on level "
					+ entryMap.getKey() + " is " + entryMap.getValue());
			if (maxCount < entryMap.getValue()) {
				maxCount = entryMap.getValue();
				levelWithMaxNode = entryMap.getKey();
			}
		}
		System.out.println("The level on which there are maximum node is: "
				+ levelWithMaxNode + " and the number of nodes are :"
				+ maxCount);

	}

	private static void getCount(Map<Integer, Integer> levelCount, int level,
			Node currentNode) {
		if (levelCount.get(level) == null) {
			levelCount.put(level, 0);
		}
		if (currentNode.getLeft() != null) {
			getCount(levelCount, level + 1, currentNode.getLeft());
		}
		if (currentNode.getRight() != null) {
			getCount(levelCount, level + 1, currentNode.getRight());
		}
		levelCount.put(level, levelCount.get(level) + 1);
	}
}
