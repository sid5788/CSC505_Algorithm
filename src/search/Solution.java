package search;

import java.io.*;
import java.util.*;

class Solution{
	
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		BinarySearch search = new BinarySearch();
		int target = scan.nextInt();
		search.binSearch(target);
	}
}