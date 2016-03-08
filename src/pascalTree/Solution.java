package pascalTree;

import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        int sum = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i <numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j==0 || j==i || i==0|| i == 1 ){
                    row.add(1);
                }else{
                    sum = list.get(i-1).get(j);
                    sum+= list.get(i-1).get(j-1);
                    row.add(sum);
                }
            }
            list.add(row);
        }
        return list;
    }
    
    public static void main(String args[]){
    	Solution sol = new Solution();
    	Scanner scan = new Scanner(System.in);
    	int num = scan.nextInt();
    	List<List<Integer>> list = sol.generate(num);
    	//Print the list
    	for (List<Integer> n:list){
    		for(int val:n){
    			System.out.print(val+" ");
    		}
    		System.out.println();
    		
    	}
    }
}