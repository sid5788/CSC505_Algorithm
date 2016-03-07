package linkedLists;

import java.io.*;
import java.lang.*;

class Solution{
	public static void main(String args[]){
		MyLinkedList<Integer> linkList = new MyLinkedList<Integer>();
		linkList.addEnd(10);
		linkList.addEnd(12);
		
		linkList.addFront(5);
		linkList.addFront(7);
		linkList.addFront(100);
		linkList.addFront(52);
		
		linkList.removeEnd();
		linkList.removeFront();
		
		linkList.addEnd(99);
		linkList.addFront(177);
		
		linkList.removeEnd();
		linkList.removeFront();
		linkList.addEnd(99);
		linkList.addFront(177);
		System.out.println(linkList.remove(1));
		System.out.println(linkList.remove(100));

		System.out.println(linkList.remove(5));

		System.out.println(linkList.remove(5));
		System.out.println("Straight:");
		linkList.displayList();
		System.out.println("Reverse:");
		linkList.displayReverseList();
	}
}