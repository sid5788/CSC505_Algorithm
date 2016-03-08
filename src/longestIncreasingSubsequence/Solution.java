/*
 * Given a sequence, find the length of the longest subsequence of a given sequence .
The longest increasing subsequence means to find a subsequence of a given sequence in which the subsequence's elements are in sorted order, lowest
to highest, and in which the subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique.
 For example:
 length of LIS for 
{ 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 
 *Soln 1: Maintain another list with the length os longest subsequence to that element. 
 *Calculate the longes subsequence at each index using the previous longest subsequence
 *lengths
 *O(n^2)
 */
package longestIncreasingSubsequence;

import java.util.*;
import java.io.*;

class Solution{
	int arr[]= {2, 5, 3, 7, 11, 8, 10, 13, 6};
	int len;
	
	public Solution(){
		len = arr.length;
	}
	public int longSubseq(){
		int max = 0;
		int end = 0;
		int list[] = new int[len];
		int prevLink[] = new int[len];
		for (int i = 0; i<len; i++){
			list[i]=1;
			prevLink[i] = i;
		}
		for (int i = 0; i <len; i++){
			for (int j = 0; j <i; j++){
				//If strictly increasing
				if(arr[i]>arr[j] && list[i] < list[j]+1){
					list[i] = list[j]+1;
					prevLink[i] = j;
				}
			}
		}
		max = list[0];
		for(int i = 1; i<len; i ++){
			if(max<list[i]){
				max = list[i];
				end = i;
			}
		}
		
		int i = end;
		while (true){
			System.out.println(arr[i]+" :"+prevLink[i]);
			if(prevLink[i]==i){
				break;
			}

			i = prevLink[i];
		}
		System.out.println();
		return max;
	}
	
    public static void main(String []args){
	    Solution sol = new Solution();
	    System.out.println(sol.longSubseq());
    }
}