package linkedLists;

public class MyLinkedList<E> {
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public MyLinkedList(){
       size = 0;
       head = new ListNode<E>(null);
       tail = new ListNode<E>(null);
       head.next= tail;
       tail.prev= head;
    }

    public void addFront(E theData){
        ListNode<E> newNode = new ListNode<E>(theData);
        newNode.next= head.next;
        newNode.prev= newNode.next.prev;
        newNode.next.prev = newNode;
        newNode.prev.next = newNode;
        this.size++;
    }
    
    public void addEnd(E theData){
    	ListNode<E> newNode = new ListNode<E>(theData);
    	newNode.next=tail;
    	newNode.prev = newNode.next.prev;
    	newNode.prev.next = newNode;
    	newNode.next.prev = newNode;
        this.size++;
    }
    
    public void removeFront(){
    	head.next = head.next.next;
    	head.next.prev = head;
        this.size--;
    }
    
    public void removeEnd(){
    	tail.prev = tail.prev.prev;
    	tail.prev.next= tail;
        this.size--;
    }
    
    public E remove(int index){
    	if(index>this.size){
    		System.out.println("Index beyond bound");
			return null;
    	}
    	ListNode<E> cur = head;
    	int curIndex = 0;
    	while (curIndex<index){
    		
    		cur = cur.next;
    		curIndex++;
    	}
    	cur.next.prev = cur.prev;
    	cur.prev.next = cur.next;
        this.size--;
    	return cur.data;
    }
    
    public int size(){
    	return this.size;
    }
    
    public void displayList(){
    	ListNode<E> cur = new ListNode<E>();
    	cur = head.next;
    	while(cur!=tail){
    		System.out.println(cur.data);
    		cur=cur.next;
    	}
    }
    
    public void displayReverseList(){
    	ListNode<E> cur = tail.prev;
    	while (cur !=head){
    		System.out.println(cur.data);
    		cur = cur.prev;
    	}
    }

}

class ListNode<E> {
     ListNode<E> next;
     ListNode<E> prev;
     E data;

     public ListNode(){
         this.data = null;
     }
     
     public ListNode(E theData){
         this.data = theData;
     }
}