package sort;

import java.io.*;
import java.util.*;

class Solution{
	
	public static void main(String []args){
	    Scanner scan = new Scanner(System.in);
	       //Read in the array
	       int arr[] = new int[99];
	       int low = 0 , high = arr.length;
	       for (int i = 0; i<high; i++) {
	           arr[i] = scan.nextInt();
	       }

	       //Call Merge Sort
	       MergeSort sorter = new MergeSort();
	       sorter.mergeSort(arr,low,high-1);
	       //Display Sorted Array
	       for(int a: arr){
	    	   System.out.print(a);
	       }
	       System.out.println();
	}
}