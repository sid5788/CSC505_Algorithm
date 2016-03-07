package Arrays;

import java.io.*;
import java.util.*;

class Solution{
	public static void main(String args[]){
		int arr[]={1,1,2,3,4,2,2,5,6};
		slidingWindowMax max = new slidingWindowMax();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = max.slidingWindowMax(arr, 3);
		
		for(int ele: list){
			System.out.println(ele);
		}
	
	}
}