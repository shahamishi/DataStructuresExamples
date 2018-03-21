package ArraysNStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class CombinationOfKElements {
	
	/*public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> combinations = new CombinationOfKElements().combine(6, 3);
		for(ArrayList<Integer> list: combinations){
			System.out.println(list);
		}
	}*/
	static List<ArrayList<Integer>> combinations = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		getCombinations(4,2);
		for(ArrayList<Integer> list: combinations){
			System.out.println(list);
		}
	}

	private static void getCombinations(int n, int k) {
		combine(1,n);
		ArrayList<Integer> list = new ArrayList<Integer>();
//		combine(1,n,k,list);
	}

	private static void combine(int current,int n){
		if(current==n){
			return;
		}
		ArrayList<Integer> list;
		for(int i=current+1;i<=n;i++){
			list = new ArrayList<Integer>();
			list.add(current);
			list.add(i);
			combinations.add(list);
		}
		combine(current+1,n);
	}
	
	private static void combine(int current,int n,int k,ArrayList<Integer> list){
		if(current==n){
			return;
		}
		if(list.size()==k){
			combinations.add(list);
		}
		for(int i=current;i<=n;i++){
			list.add(i);
			combine(current+1,n,k,list);
		}
		
	}
	
	//LeetCode
	/*public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		if (n <= 0 || n < k)
			return result;
	 
		ArrayList<Integer> item = new ArrayList<Integer>();
		dfs(n, k, 1, item, result); // because it need to begin from 1
	 
		return result;
	}
	 
	private void dfs(int n, int k, int start, ArrayList<Integer> item,
			ArrayList<ArrayList<Integer>> res) {
		if (item.size() == k) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
	 
		for (int i = start; i <= n; i++) {
			item.add(i);
			dfs(n, k, i + 1, item, res);
			item.remove(item.size() - 1);
		}
	}*/
}
