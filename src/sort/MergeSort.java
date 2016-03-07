package sort;

import java.util.*;
import java.io.*;

public class MergeSort {
	   public void display(int arr[], int low, int high){
		   for(int i = low; i<=high; i++){
			   System.out.print(arr[i]);
		   }
		   System.out.println();
	   }
	   public void merge(int arr[], int low, int mid, int high) {
		   //Sid: Trying to do an in place merge doesn't work
		   /*
	       int i = mid, j = high, temp = 0;
	       while (j>mid ) {
	           if (arr[i] < arr[j]) {
	               j--;
	           }else{
	              break;
	           }
	       }
	       while (i>=low ) {
	           if (arr[j] < arr[i]) {
	               i--;
	           }else{
	              break;
	           }
	       }*/
		   
		   //Sid: Normal merge
		   int length = high - low +1;
		   int temp[] = new int[length];
		   int i = low, j = mid+1, cur = 0;
		   while (i<=mid && j <= high){
		      if (arr[i]<arr[j]){
		         temp[cur] = arr[i];
		         i++;
		      }else {
		         temp[cur] = arr[j];
		         j++;
		      }
		      cur++;
		   }

		   while(i<=mid){
		      temp[cur] = arr[i];
		      i++;
		      cur++;
		   }

		   while(j<=high) {
		      temp[cur] = arr[j];
		      j++;
		      cur++;
		   }

		   i = low;
		   for (int k = 0; k < length; k++) {
		      arr[i] = temp[k];
		      i++;
		   }
	       
	       

	   }

	   public void mergeSort(int arr[], int low, int high) {
	       int mid;
	       if (low < high) {
	          mid = low + (high-low)/2;
	          mergeSort(arr, low, mid);
	          mergeSort(arr, mid+1, high);
	          System.out.println("merging these two:");
	          display(arr,low,mid);
	          display(arr,mid+1,high);
	          merge(arr, low, mid, high);
	          System.out.println("merged these two:");
	          display(arr,low,high);
	       }
	   }

}
