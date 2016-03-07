/*
 * Sid HackerRank Halloween Party. Divide choclate into max 1x1 pieces with k cuts 
 */

package hRankChocolateHalloweenParty;

import java.io.*;
import java.util.*;

public class Solution {
    private long T,k;
    Scanner scan = new Scanner(System.in);
	public Solution(){
		
		T = scan.nextInt();
		k = 0;
	}
	public void maxCuts(){
		long x = 0,hor,ver;
		k = scan.nextInt();
		if (k<2){
			System.out.println(x);
		}else{
			hor = k/2;
			ver = k - hor;
			x = hor * ver;
			System.out.println(x);
		}
	}
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	for (int i = 0; i<sol.T; i++){
    		sol.maxCuts();
    	}
    }
}