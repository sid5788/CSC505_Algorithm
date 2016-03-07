package search;

import java.util.*;

public class BinarySearch {
	public static void binSearch(int target){
		//int arr[] = new int[100];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		for (int i = 0; i<100; i++){
			num= scan.nextInt();
			arr.add(num);
		}
		//Sort the array Arrays.sort(arr) if an integer array
		arr.sort(null);
		System.out.println("Sorted Array:");
		for (int a: arr){
			System.out.print(a);
		}
		//BinSearch
		int high = (arr.size() -1), low =0;
		// If low and high are too large this will be a problem as the sum will overflow
		int mid = low+((high-low)/2);
		while(low < high){
			mid = low+((high-low)/2);
			System.out.println("Low:"+low+"Mid:"+mid+"High:"+high);
			
			if (arr.get(mid)==target) {
			  System.out.println("Integer found at ="+mid);
			  return;
		    }else if(arr.get(mid)<target){
		    	low = mid+1;
		    }else{
		    	high = mid-1;
		    }
		}
		System.out.println("Integer Not Found");
	}
}
